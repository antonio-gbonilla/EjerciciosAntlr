public class kk {
    public static void main(String[] args) {
        // ======================================================
// TEST: Cortocircuito AND
// ======================================================
    int x = 0;
    int y = 0;
boolean flag = false && (x = 1) > 0;

// ======================================================
// TEST: Cortocircuito OR
// ======================================================
boolean flag2 = true || (y = 1) > 0;
        System.out.println(flag);
        System.out.println(flag2);
    }
}
