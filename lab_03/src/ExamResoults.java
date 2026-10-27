import java.util.Arrays;

public class ExamResoults {
    private int[] points;

    public ExamResoults(int[] points) {
        this.points = Arrays.copyOf(points, points.length);
    }

    int[] getPoints(){
        return Arrays.copyOf(

                this.points,

                this.points.length

        );
    }
}
