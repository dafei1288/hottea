import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
//import com.theokanning.openai.OpenAiService;
//import com.theokanning.openai.completion.chat.ChatCompletionRequest;
//import com.theokanning.openai.completion.chat.ChatCompletionResult;
//import com.theokanning.openai.completion.chat.ChatMessage;
import com.unfbx.chatgpt.OpenAiClient;
import com.unfbx.chatgpt.entity.chat.ChatCompletion;
import com.unfbx.chatgpt.entity.chat.ChatCompletionResponse;
import com.unfbx.chatgpt.entity.chat.Message;
import io.github.yizhiru.thulac4j.POSTagger;
import io.github.yizhiru.thulac4j.Segmenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.ansj.splitWord.analysis.ToAnalysis;

public class T {

  public static void main5(String[] args) {
    String str = "欢迎使用ansj_seg,(ansj中文分词)在这里如果你遇到什么问题都可以联系我.我一定尽我所能.帮助大家.ansj_seg更快,更准,更自由!" ;
    System.out.println(ToAnalysis.parse(str));

    System.out.println();
    str = "给我一份三月份的销售详情" ;
    System.out.println(ToAnalysis.parse(str));

    str = "去年2月的营销数据" ;
    System.out.println(ToAnalysis.parse(str));
  }

  public static void main4(String[] args) {
    String sentence = "滔滔的流水，向着波士顿湾无声逝去";
    List<String> words = Segmenter.segment(sentence);
    words.stream().forEach(System.out::println);
    System.out.println();
    sentence = "给我一份三月份的销售详情";
    words = Segmenter.segment(sentence);
    words.stream().forEach(System.out::println);
// [滔滔, 的, 流水, ，, 向着, 波士顿湾, 无声, 逝去]

//    POSTagger pos = new POSTagger("models/model_c_model.bin", "models/model_c_dat.bin");
//    List<SegItem> words = pos.tagging(sentence);
// [滔滔/a, 的/u, 流水/n, ，/w, 向着/p, 波士顿湾/ns, 无声/v, 逝去/v]
  }

  public static void main3(String[] args) {

    OpenAiClient openAiClient = OpenAiClient.builder()
        .apiKey("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")
        //自己做了代理就传代理地址，没有可不不传
//                .apiHost("https://自己代理的服务器地址/")
        .build();
    //聊天模型：gpt-3.5
    Message message = Message.builder().role(Message.Role.USER).content("你好啊我的伙伴！").build();
    ChatCompletion chatCompletion = ChatCompletion.builder().messages(Arrays.asList(message)).build();
    ChatCompletionResponse chatCompletionResponse = openAiClient.chatCompletion(chatCompletion);
    chatCompletionResponse.getChoices().forEach(e -> {
      System.out.println(e.getMessage());
    });


  }

  public static void main(String[] args) {
    JiebaSegmenter segmenter = new JiebaSegmenter();
    String[] sentences =
        new String[] {"给我一份三月份的销售详情"};
    for (String sentence : sentences) {
      System.out.println(segmenter.process(sentence, SegMode.INDEX).toString());
    }
  }

  public static void main1(String[] args) {

//    // 消息列表
//    List<ChatMessage> list = new ArrayList<>();
//
//    // 给chatGPT定义一个身份，是一个助手
//    ChatMessage chatMessage = new ChatMessage();
//    chatMessage.setRole("system");
//    chatMessage.setContent("如何使用chatgpt api做分词？");
//    list.add(chatMessage);
//
//    ChatCompletionRequest request = ChatCompletionRequest.builder()
//        .messages(list)
//        .model("gpt-3.5-turbo")
//        .build();
//    OpenAiService service = new OpenAiService("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");
//
//
//
//    // chatCompletion 对象就是chatGPT响应的数据了
//    ChatCompletionResult chatCompletion = service.createChatCompletion(request);
//    chatCompletion.getChoices().stream().forEach(it->System.out.println(it.getMessage()));
  }
}
