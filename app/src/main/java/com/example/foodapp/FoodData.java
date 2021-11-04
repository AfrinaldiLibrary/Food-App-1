package com.example.foodapp;

import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food(
                "Batagor",
                "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.",
                "Rp. 15000",
                context.getDrawable(R.drawable.batagor)));

        list.add(new Food("Black Salad",
                "Salad merupakan salah satu makanan sehat yang terdiri dari buah dan sayuran segar serta biasanya ditambah dengan protein yang berasal dari daging ataupun unggas dan dihidangkan bersamaan dengan dressing berupa saus sambal atau mayonnaise.",
                "Rp. 20000",
                context.getDrawable(R.drawable.black_salad)));

        list.add(new Food("Cappuccino",
                "Kapucino adalah minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania. ",
                "Rp. 18000",
                context.getDrawable(R.drawable.cappuchino)));

        list.add(new Food("Cheesecake",
                "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.",
                "Rp. 20000",
                context.getDrawable(R.drawable.cheesecake)));

        list.add(new Food(
                "Cireng",
                "Cireng adalah jenis makanan ringan yang berasal dari daerah Sunda. Cireng ini dibuat dengan cara menggoreng campuran adonan yang bahan utamanya adalah tepung kanji atau tepung tapioka.",
                "Rp. 10000",
                context.getDrawable(R.drawable.cireng)));

        list.add(new Food(
                "Donut",
                "Donat adalah suatu bentuk makanan yang digoreng, berdasarkan campuran adonan tepung terigu, telur, metega, dan gula.",
                "Rp. 10000",
                context.getDrawable(R.drawable.donut)));

        list.add(new Food(
                "Kopi Hitam",
                "Kopi hitam, merupakan hasil ektraksi langsung dari perebusan biji kopi yang disajikan tanpa penambahan perisa apapun. Espreso, merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.",
                "Rp. 12000",
                context.getDrawable(R.drawable.kopi_hitam)));

        list.add(new Food(
                "Mie Goreng",
                "Mi goreng berarti \"mi yang digoreng\" adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura.",
                "Rp. 15000",
                context.getDrawable(R.drawable.mie_goreng)));

        list.add(new Food(
                "Nasi Goreng",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
                "Rp. 20000",
                context.getDrawable(R.drawable.nasigoreng)));

        list.add(new Food("Nasi Goreng Spesial",
                "Sama aja, bedanya ini spesial",
                "25000",
                context.getDrawable(R.drawable.nasigoreng2)));

        list.add(new Food(
                "Teh Manis",
                "Teh manis adalah minuman yang terbuat dari larutan teh yang diberi pemanis, biasanya gula tebu, sebelum minuman ini siap disajikan. Untuk konteks Indonesia, teh manis yang diberi es biasa disebut es teh.",
                "Rp. 5000",
                context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
