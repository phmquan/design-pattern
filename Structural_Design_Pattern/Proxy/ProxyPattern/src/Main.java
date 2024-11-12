public class Main {
    public static void main(String[] args) {

        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("favicon.icon");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}