import java.io.*;

class Emp {
    void salary(float basic, float da) {
        float net = basic + da;
        System.out.println("Peon Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float it) {
        float gross = basic + da + hra;
        float net = gross - it;
        System.out.println("Jr Executive Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float pf, float it) {
        float gross = basic + da + hra;
        float net = gross - (pf + it);
        System.out.println("Executive Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float ma, float pf, float it, float pt) {
        float gross = basic + da + hra + ma;
        float net = gross - (pf + it + pt);
        System.out.println("Manager Net Salary: " + net);
    }
}

class EmpCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Emp emp = new Emp();
        int choice;

        do {
            System.out.println("\n--- Salary Calculator ---");
            System.out.println("1. Manager");
            System.out.println("2. Executive");
            System.out.println("3. Jr Executive");
            System.out.println("4. Peon");
            System.out.println("5. Exit");
            System.out.print("Enter your role (1-5): ");

            choice = Integer.parseInt(br.readLine());
            float basic, da, hra, ma, pf, it, pt;
            switch (choice) {
                case 1:
                    System.out.print("Enter Basic Salary: ");
                    basic = Float.parseFloat(br.readLine());
                    da = basic * 0.20f;
                    hra = basic * 0.10f;
                    ma = 1000;
                    pf = basic * 0.12f;
                    it = basic * 0.05f;
                    pt = basic * 0.02f;
                    emp.salary(basic, da, hra, ma, pf, it, pt);
                    break;

                case 2:
                    System.out.print("Enter Basic Salary: ");
                    basic = Float.parseFloat(br.readLine());
                    da = basic * 0.20f;
                    hra = basic * 0.10f;
                    pf = basic * 0.12f;
                    it = basic * 0.05f;
                    emp.salary(basic, da, hra, pf, it);
                    break;

                case 3:
                    System.out.print("Enter Basic Salary: ");
                    basic = Float.parseFloat(br.readLine());
                    da = basic * 0.20f;
                    hra = basic * 0.10f;
                    it = basic * 0.05f;
                    emp.salary(basic, da, hra, it);
                    break;

                case 4:
                    System.out.print("Enter Basic Salary: ");
                    basic = Float.parseFloat(br.readLine());
                    da = basic * 0.20f;
                    emp.salary(basic, da);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
