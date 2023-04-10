import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPT_API {

  public static void main(String[] args)  throws Exception{
    // URL构造
    String apiUrl = "https://api.chatgpt.com/v1/message/segmentation";

    // 参数
    String text = "这是一段文本，用于测试ChatGPT API的分词功能";
    String postData = "text=" + text+"&api_key=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";

    // 创建连接
    URL url = new URL(apiUrl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.setDoOutput(true);
    conn.setDoInput(true);
    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    conn.connect();

    // 发送post
    conn.getOutputStream().write(postData.getBytes());

    // 接收结果
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    StringBuffer sb = new StringBuffer();
    String line = "";
    while ((line = reader.readLine()) != null) {
      sb.append(line);
    }
    reader.close();
    conn.disconnect();

    // 解析结果
    System.out.println(sb.toString());
  }

}