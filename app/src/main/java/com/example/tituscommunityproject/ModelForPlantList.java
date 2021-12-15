package com.example.tituscommunityproject;

import java.util.Comparator;

public class ModelForPlantList {
    private String title, description, common_name, family, origin, uses_or_type, method_of_propagation, special_advantage_or_disadvantage, condition, common_disease_and_infection, pronounce_botanical_name, serial_numbers;
    private int img, imageView3;






    public int getImageView3() {
        return imageView3;
    }

    public void setImageView3(int imageView3) {
        this.imageView3 = imageView3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSerial_numbers() {
        return serial_numbers;
    }

    public void setSerial_numbers(String serial_numbers) {
        this.serial_numbers = serial_numbers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUses_or_type() {
        return uses_or_type;
    }

    public void setUses_or_type(String uses_or_type) {
        this.uses_or_type = uses_or_type;
    }

    public String getMethod_of_propagation() {
        return method_of_propagation;
    }

    public void setMethod_of_propagation(String method_of_propagation) {
        this.method_of_propagation = method_of_propagation;
    }

    public String getSpecial_advantage_or_disadvantage() {
        return special_advantage_or_disadvantage;
    }

    public void setSpecial_advantage_or_disadvantage(String special_advantage_or_disadvantage) {
        this.special_advantage_or_disadvantage = special_advantage_or_disadvantage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCommon_disease_and_infection() {
        return common_disease_and_infection;
    }

    public void setCommon_disease_and_infection(String common_disease_and_infection) {
        this.common_disease_and_infection = common_disease_and_infection;
    }

    public String getPronounce_botanical_name() {
        return pronounce_botanical_name;
    }

    public void setPronounce_botanical_name(String pronounce_botanical_name) {
        this.pronounce_botanical_name = pronounce_botanical_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public static final Comparator<ModelForPlantList> By_TITLE_ASCENDING =new Comparator<ModelForPlantList>() {
        @Override
        public int compare(ModelForPlantList o1, ModelForPlantList o2) {
            return o1.getSerial_numbers().compareTo(o2.getSerial_numbers());
        }

    };

    public static final Comparator<ModelForPlantList>By_TITLE_DESCENDING =new Comparator<ModelForPlantList>() {
        @Override
        public int compare(ModelForPlantList o1, ModelForPlantList o2) {
            return o2.getSerial_numbers().compareTo(o1.getSerial_numbers());
        }

    };
}
