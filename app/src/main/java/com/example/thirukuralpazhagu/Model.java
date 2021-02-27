package com.example.thirukuralpazhagu;

public class Model {
    int img1 ;
    int img2;
    String head1;
    String head2;
    String head3;
    String desc1;
    String desc2;

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public String getHead1() {
        return head1;
    }

    public void setHead1(String head1) {
        this.head1 = head1;
    }

    public String getHead2() {
        return head2;
    }

    public void setHead2(String head2) {
        this.head2 = head2;
    }

    public String getHead3() {
        return head3;
    }

    public void setHead3(String head3) {
        this.head3 = head3;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public  Model(int img1, int img2, String head1, String head2, String head3, String desc1, String desc2){
        this.img1= img1;
        this.img2=img2;
        this.head1=head1;
        this.head2=head2;
        this.head3=head3;
        this.desc1=desc1;
        this.desc2=desc2;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }
}
