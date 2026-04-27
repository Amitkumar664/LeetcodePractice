import java.util.*;

public class BrowserHistory {

    private List<String> history;
    private int curr;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
    }

    public void visit(String url) {
        while (history.size() > curr + 1) {
            history.remove(history.size() - 1);
        }
        history.add(url);
        curr++;
    }

    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history.get(curr);
    }

    public String forward(int steps) {
        curr = Math.min(history.size() - 1, curr + steps);
        return history.get(curr);
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        System.out.println(browser.back(1));     // facebook.com
        System.out.println(browser.back(1));     // google.com
        System.out.println(browser.forward(1));  // facebook.com

        browser.visit("linkedin.com");

        System.out.println(browser.forward(2));  // linkedin.com
        System.out.println(browser.back(2));     // google.com
        System.out.println(browser.back(7));     // leetcode.com
    }
}