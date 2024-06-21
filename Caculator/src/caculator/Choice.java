package caculator;

public class Choice extends CaculatorNumber {

    @Override
    int Total() {
        input();
        return super.a + super.b;
    }

    void printTotal() {
        System.out.println("Total = " + Total());
    }

    @Override
    int Subtract() {
        input();

        return super.a - super.b;
    }

    void printSubtract() {
        System.out.println("Subtract = " + Subtract());
    }

    @Override
    int Product() {
        input();

        return super.a * super.b;
    }

    void printProduct() {
        System.out.println("Product = " + Product());
    }

    @Override
    float Divide() {

        while (true) {
            try {
                input();
                break;
            } catch (Exception e) {
                //if (b == 0) {
                    System.out.println("Loi"+e);
                //}
                
            }
        }

        return super.a / super.b;
    }

    void printDivice() {

        System.out.println("Divice = " + Divide());
    }

}
