package Ch08.sec02.geometry.common;

public class Polygon {
    protected int x[];              // 꼭지점 x 좌표
    protected int y[];              // 꼭지점 y 좌표
    protected Polygon(int vertexNum) {
        x = new int[vertexNum];
        y = new int[vertexNum];
    }
    protected void setPoint(int index, int x, int y) {
        this.x[index] = x;
        this.y[index] = y;
    }
}
