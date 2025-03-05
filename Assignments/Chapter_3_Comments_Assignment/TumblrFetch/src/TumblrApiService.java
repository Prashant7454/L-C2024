public class TumblrApiService {
    private static final String API_URL = "https://%s.tumblr.com/api/read/json?type=photo&num=%d&start=%d"; //API End point

    public static String fetchTumblrData(String blogName, int start, int end) {
        int numPosts = (end - start) + 1;
        String url = String.format(API_URL, blogName, numPosts, (start - 1)); //Format End point

        return HttpClientHelper.get(url);
    }
}
