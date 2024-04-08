public class A {
    private int A1;
    private float A2;

    public Integer getSoma(Integer a, Integer b) {
        return a + b;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }

    public int getA1() {
        return A1;
    }

    public float getA2() {
        return A2;
    }

    public void MA1() {
        System.out.println("MA1");
    }

    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }
}
