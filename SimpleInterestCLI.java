class SimpleInterestCLI{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java SimpleInterestCLI <Principal> <Rate> <Time>");
            return;
        }

        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);
    }
}

