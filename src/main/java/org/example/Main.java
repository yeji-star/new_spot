package org.example;

class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Article[] articles = new Article[10];

        Article article1 = new Article();
        articles[0] = article1;

        Article article2 = new Article();
        articles[1] = article2;

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);

        System.out.println(article1.id);
        System.out.println(article2.id);

    }
}

class Article {
    static int lastid;
    int id;
    String rg;

    static {
        lastid = 0;
    }

    Article() {
        this(lastid + 1, "2025"); //아래의 아티클 this로 들어간다
        //다른 생산자 호출, 실행
        lastid++;

    }

    Article(int id, String rg) {
        this.id = id;
        this.rg = rg;
    }

}

//CRUD = C <-글쓰기 R <-상세보기, 글읽기, 검색 U <- 글수정 D <- 글삭제