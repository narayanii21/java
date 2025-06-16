class overriding {
    int age ;
    overriding(int age)
    {
        this.age=age;

    } 
    void print(){
        System.println(age);
        
    }
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.data();
        System.out.println(obj);
    }
    
}
