/**
 * @author guodingcheng
 * @date 2019/11/7 17:51
 **/
public class CanonicalRequest {

    private String method;

    private String pathAndQuery;

    private String content;

    public CanonicalRequest(String method,String pathAndQuery,String content){
        this.method = method;
        this.content = content;
        this.pathAndQuery = pathAndQuery;
    }
}
