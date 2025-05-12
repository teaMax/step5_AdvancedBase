package topic3_Enums.task5_Operation;

public enum Operation {
    PLUS{
        @Override
        public double apply(double x, double y){
            return x + y;
        }
    },
    MINUS{
        public double apply(double x, double y){
            return x - y;
        }
    },
    TIMES{
        public double apply(double x, double y){
            return x * y;
        }
    },
    DIVIDE{
        public double apply(double x, double y){
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}
