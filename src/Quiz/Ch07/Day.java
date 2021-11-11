package Quiz.Ch07;

public enum Day {
    MONDAY("월"), TUESDAY("화"), WEDNESDAY("수"),THURSDAY("목"), FRIDAY("금"), SATURDAY("토"), SUNDAY("일");
    final private String name;
    Day (String name) {
        this.name =name;
    }
    String value(){
        return name;
    }
}