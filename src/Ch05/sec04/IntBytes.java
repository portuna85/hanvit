package Ch05.sec04;

public class IntBytes {
    static byte firstByte(int num) {
        num = (num >> 24) & 0xFF;
        return (byte) num;
    }
    static byte secondByte(int num) {
        num = (num >> 16) & 0xFF;
        return (byte) num;
    }
    static byte thirdByte(int num) {
        num = (num >> 8) & 0xFF;
        return (byte) num;
    }
    static byte fourthByte(int num) {
        num = num & 0xFF;
        return (byte) num;
    }
}
