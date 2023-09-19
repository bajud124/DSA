package InterviewBit.Math;

public class TotalMoveForBishop {
    public int solve(int A, int B) {
        // result += A-1;
        // result += 8-B;
        // result += Math.min(A-1, 8-B);
        // result += Math.min(8-B, A-1);
        int result = 0;
        int x =A;
        int y =B;
        while (x<=8&&y<=8 &&x>0&&y>0){
            x++;
            y++;
            result = x <= 8 && y <= 8 && y > 0 && x > 0 ? result + 1 : result;
        }
        x=A;y=B;
        while (x<=8&&y<=8 &&x>0&&y>0){
            x--;
            y--;
            result = x <= 8 && y <= 8 && y > 0 && x > 0 ? result + 1 : result;
        }
        x=A;y=B;
        while (x<=8&&y<=8 &&x>0&&y>0){
            x--;
            y++;
            result = x <= 8 && y <= 8 && y > 0 && x > 0 ? result + 1 : result;
        }
        x=A;y=B;
        while (x<=8&&y<=8 &&x>0&&y>0){
            x++;
            y--;
            result = x <= 8 && y <= 8 && y > 0 && x > 0 ? result + 1 : result;
        }
        return result;
    }
}
