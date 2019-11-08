import org.junit.Test;
import org.springframework.http.HttpMethod;

/**
 * @author guodingcheng
 * @date 2019/11/7 16:47
 **/
public class Sign {

    @Test
    public  void sign() {
        String accessKey = "IB3QDGujjj909R54qDhLhgHgCT3ti8Vz";
        String secretKey = "EWbbJ1jpqe0TvBAk6Bmztk0r0PFmYbkD";

        String content ="{\"uniqueCodes\":[\"803168\"]}";
        HttpMethod method = HttpMethod.POST;
        String pathAndQuery = "/ota/platform/directHotel/getHotelInfos";

        //指定请求method和uri来组成一个请求
        CanonicalRequest canonicalRequest = new CanonicalRequest(method.toString(), pathAndQuery, content);
        Signer signer = new Signer(canonicalRequest, accessKey, secretKey);

        // 获取签名
        String signature = signer.getSignature();

        System.out.println(signature);//签名信息
    }

}
