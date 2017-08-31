public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public double getLength(){
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient(){
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }


    public String toString(){
        return "This line start with " + begin.toString() + " and ends with " + end.toString();
    }

    public Point getBegin() {
        return begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        end.setY(endX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setBeginXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
}