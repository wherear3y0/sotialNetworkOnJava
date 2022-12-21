package org.example;

// Если честно я не до конца понимаю как именно должна работать галлерея в консоли - но добавил описание на будущее
// если вдруг пригодится

public class Photo {
    private int PhotoId; // айди фото
    private int MainPhotoId; // айди фото которое стоит на автарке

    //геттеры и сеттеры
    public int getPhotoId(){
        return PhotoId;
    }
    public void setPhotoId(int PhotoId){
        this.PhotoId = PhotoId;
    }

    public int getMainPhotoId(){
        return MainPhotoId;
    }
    public void setMainPhotoId(int MainPhotoId){
        this.MainPhotoId = MainPhotoId;
    }

}
