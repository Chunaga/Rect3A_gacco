class Rect3A{
    int x;
    int y;
    int width;
    int height;
    
    void SetData(int x0, int y0, int w, int h){
        x = x0;
        y = y0;
        width = w;
        height = h;
    }
    
    void printInfo(){
    	System.out.println("長方形の位置"+ x + "," + y + "幅" + width + "高さ" + height);
    }
    
    void translate(int dx, int dy){
    	x = x + dx; 
	y = y + dy;
    }
    
    double calcArea() {
    	return width * height;
    }
    
    
}