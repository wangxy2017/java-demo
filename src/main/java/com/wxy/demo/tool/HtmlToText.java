package com.wxy.demo.tool;

import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.IOException;
import java.io.StringReader;

/**
 * @Author wxy
 * @Date 19-10-16 下午5:16
 * @Description TODO
 **/
public class HtmlToText {

    public static String convert(String html) throws IOException {
        final StringBuilder b = new StringBuilder();
        ParserDelegator delegator = new ParserDelegator();
        // the third parameter is TRUE to ignore charset directive
        delegator.parse(new StringReader(html), new ParserCallback() {
            public void handleText(char[] data, int pos) {
                b.append(data).append("\n");
            }
        }, true);
        return b.toString();
    }

    public static void main(String[] args) throws IOException {
        String html = "<html><div>123</div><br><div>123</div><br></html>";
        String convert = HtmlToText.convert(html);
        System.out.println(convert);
    }
}
