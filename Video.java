public class Video {
    private  String title;
    private  String genre;

    Video(){
        System.out.println("Vıdeo object is created");
    }

    Video(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Video obj) {
        return obj.getTitle().equals(title);
    }

    @Override
    public String toString() {
        return  "Title:"+title+",Genre:"+genre;
    }
}
