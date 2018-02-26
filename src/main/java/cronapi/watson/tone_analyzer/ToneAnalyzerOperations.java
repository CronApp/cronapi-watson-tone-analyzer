package cronapi.watson.tone_analyzer;

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData
public final class ToneAnalyzerOperations {

  @CronapiMetaData
  public static ToneAnalysis tone(String versionDate, String username, String password, String endPoint,
                                  Map<String, String> headers, ToneOptions options) {
    ToneAnalyzer service = new ToneAnalyzer(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.tone(options).execute();
  }

  @CronapiMetaData
  public UtteranceAnalyses toneChat(String versionDate, String username, String password, String endPoint,
                                                 Map<String, String> headers, ToneChatOptions options) {
    ToneAnalyzer service = new ToneAnalyzer(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.toneChat(options).execute();
  }
}
