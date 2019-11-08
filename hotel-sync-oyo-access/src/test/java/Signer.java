/**
 * @author guodingcheng
 * @date 2019/11/7 17:54
 **/
public class Signer {

    private CanonicalRequest canonicalRequest;

    private String accessKey;

    private String secretKey;


    public Signer(CanonicalRequest canonicalRequest, String accessKey, String secretKey) {
        this.canonicalRequest = canonicalRequest;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getSignature(){

        String url = this.accessKey + this.secretKey;
        return url;
    }
}
