public class VideoMain {
    public static void main(String[] args) {
        Video video1 = new Video("title1", "genre1");
        Video video2 = new Video("title2", "genre2");

        Node<Video> videoNode1 = new Node<>(video1);
        System.out.println(videoNode1);
        Node<Video> videoNode2 = new Node<>(video2);

        videoNode1.setNext(videoNode2);
        System.out.println(videoNode1.getNext());
    }
}
