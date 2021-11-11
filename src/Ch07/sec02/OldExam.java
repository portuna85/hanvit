package Ch07.sec02;

public class OldExam {
    public static void main(String[] args) {
    ClothInfo obj = new ClothInfo("321919","반팔 티셔츠","면 100%",ClothInfo.Season.SUMMER);
    System.out.println("상품 코드 : "+obj.code);
        System.out.println("삼품 명 : "+obj.name);
        System.out.println("소재 : " + obj.material);
        System.out.println("계절구분  : " + obj.season);
    }
}
