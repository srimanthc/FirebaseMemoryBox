package com.example.firebasememorybox;

import android.os.Parcel;
import android.os.Parcelable;

public class Memory implements Parcelable {
    private int memory;
    private String name;
    private String desc;
    private int imageResourceId;

    public Memory(int memory, String name, String desc, int imageResourceId) {
        this.memory = memory;
        this.name = name;
        this.desc = desc;
        this.imageResourceId = 0;
    }
    public Memory() {
        this.memory = 0;
        this.name = "";
        this.desc = "";
        this.imageResourceId = 0;
    }
    public static final Parcelable.Creator<Memory> CREATOR = new
            Parcelable.Creator<Memory>() {

                @Override
                public Memory createFromParcel(Parcel parcel) {
                    return new Memory(parcel);
                }

                @Override
                public Memory[] newArray(int size) {
                    return new Memory[0];
                }
            };

    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(memory);
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeInt(imageResourceId);
    }

    public Memory(Parcel parcel){
        memory = parcel.readInt();
        name = parcel.readString();
        desc = parcel.readString();
        imageResourceId = parcel.readInt();
    }


    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
