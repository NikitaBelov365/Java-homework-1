public class Fourth {
    public static void main(String[] args) {
        String expression = "?5 + ?5 = 69";
        expression = expression.replaceAll(" ", "");
        String[] exp_arr = expression.split("=");
        String left = exp_arr[0];
        int right = Integer.parseInt(exp_arr[1]);
        int q_index = left.indexOf("?");
        int w_index = left.indexOf("?", q_index+1);
        String left_template = left.replace("?", "%d");
        boolean solution = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String eq = String.format(left_template, i, j);
                String[] eq_arr = eq.split("\\+");
                int l = Integer.parseInt(eq_arr[0]);
                int r = Integer.parseInt(eq_arr[1]);
                int summ = l+r;
                if (summ == right) {
                    System.out.println(eq + " = " + right);
                    solution = true;
                }
            }
        }
        if (solution == false) {
            System.out.println("No matches");
        }
    }
}
