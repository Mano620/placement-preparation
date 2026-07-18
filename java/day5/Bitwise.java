public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int andResult = a & b;
        System.out.println("Bitwise AND: " + andResult);

        int orResult = a | b;
        System.out.println("Bitwise OR: " + orResult);

        int xorResult = a ^ b;
        System.out.println("Bitwise XOR: " + xorResult);

        int notResult = ~a;
        System.out.println("Bitwise NOT: " + notResult);

        int leftShiftResult = a << 1;
        System.out.println("Left Shift: " + leftShiftResult);

        int rightShiftResult = a >> 1;
        System.out.println("Right Shift: " + rightShiftResult);
}
}
    
