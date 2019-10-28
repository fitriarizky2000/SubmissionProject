package objekwisatayogyakarta.com;

import java.util.ArrayList;

public class DataObjekWisata {
    private static String[] Names = {
            "Candi Prambanan",
            "Pantai Parangtritis",
            "Jalan Malioboro",
            "Goa Jomblang",
            "Arung Jeram Citra Elo",
            "Kraton Yogyakarta",
            "Kebun Binatang Gembira Loka",
            "Gunung Merapi",
            "Candi Borobudur",
            "Istana Air Taman Sari"
    };

    private static String[] Details = {
            "Candi Prambanan merupakan salah satu tempat wisata di Yogyakarta yang wajib dikunjungi karena Candi Prambanan merupakan kompleks candi Hindu yang terbesar di Indonesia. Selain itu, Candi Prambanan juga dihiasi relief yang diukir mengelilingi candi dan menceritakan kisah Ramayana dan Krishnayana. Candi Prambanan berlokasi sektiar 17 KM dari psuat kota Yogyakarta. Apabila anda tidak membawa kendaraan pribadi, untuk mencapai Candi Prambanan anda cukup menggunakan bus dan turun di halte Prambanan, sangat mudah mencapai Candi Prambanan.",
            "Pantai Parangtritis adalah pantai yang paling terkenal di Yogyakarta, sehingga Pantai Parangtritis layak disebut sebagai salah satu tempat wisata di Yogyakarta yang wajib dikunjungi. Berlokasi sekitar 25 KM di selatan pusat kota Yogyakarta, Pantai Parangtritis adalah pantai yang berada di tepi Samudra Hindia sehingga mempunyai karakteristik ombak dan arus yang cukup besar dan kuat. Keunikan dari Pantai Parangtritis adalah adanya bukit pasir yang disebut gumuk di sekitar pantai. Apabila anda ingin suatu pengalaman yang berbeda, anda dapat mencoba bermain paralayang di Bukit Parangndog, ",
            "Malioboro merupakan nama sebuah jalan di Yogyakarta. Jalan Malioboro ini sangatlah terkenal dan sudah menjadi salah satu tempat wisata di Yogyakarta yang wajib dikunjungi, bahkan untuk berfoto di penanda Jalan Malioboro saja kita sering kali harus mengantri terlebih dahulu. Nama Jalan Malioboro ini berasal dari bahasa Sansekerta dan mempunyai arti karangan bunga. ",
            "Goa Jomblang adalah sebuah goa wisata yang berlokasi di Gunung Kidul, Yogyakarta. Goa Jomblang merupakan goa vertikal yang mempunyai sebuah hutan purba di dalamnya. Selain itu, apabila anda datang ke Goa Jomblang pada jam 10 sampai dengan jam 12 siang, anda akan dapat melihat cahaya menembus goa yang sering disebut sebagai cahaya surga. Keindahan dan keunikan Goa Jomblang membuatnya menjadi salah satu tempat wisata di Yogyakarta yang wajib dikunjungi.",
            "Arung Jeram Citra Elo adalah salah satu arung jeram yang ada di Yogyakarta. Arung Jeram Citra Elo adalah arung jeram yang paling cocok untuk keluarga atau pemula karena arusnya yang tidak berbahaya bila dibandingkan dengan sungai lain di sekitar Yogyakarta. Selain itu Arung Jeram Citra Elo juga dapat dimainkan kapan saja, tidak seperti sungai lain di Yogyakarta yang kebanyakan hanya dapat diarungi pada saat musim hujan saja.",
            "Keraton Yogyakarta adalah salah satu tempat wisata di Yogyakarta yang ramai dikunjungi. Keraton Yogyakarta merupakan sebuah bangunan bersejarah kesultanan Yogyakarta yang ditinggali oleh Sultan dan keluarganya. Selain dapat menikmati arsitektur kesultanan kuno, anda juga dapat berkunjung ke museum yang mempunyai koleksi barang-barang kesultanan Yogyakarta yang sebagian merupakan hadiah dari raja Eropa. Apabila anda ingin datang mengunjungi tempat wisata ini, datanglah agak pagi karena Keraton Yogyakarta buka dari jam 8 pagi sampai dengan jam 2 siang saja.",
            "Kebun Binatang Gembira Loka adalah sebuah tempat wisata keluarga di Yogyakarta yang mempunyai banyak koleksi hewan dari berbagai tempat di dunia. Selain dapat melihat dan berinteraksi dengan berbagai jenis hewan seperti selayaknya kebun binatang pada umumnya, anda juga dapat bermain di beberapa wahana permainan yang terdapat di Kebun Binatang Gembira Loka. Wahana permainan yang ada di Kebun Binatang Gembira Loka yaitu kolam tangkap ikan, sepeda air, ATV, perahukayuh, menunggang gajah, menunggang onta, dan lain-lain. Harga tiket masuk Kebun Binatang Gembira Loka adalah 25,000 Rupiah per orang.",
            "Gunung Merapi merupakan salah satu gunung di sekitar Yogyakarta. Gunung Merapipakan gunung yang paling terkenal di Yogyakarta, dan merupakan salah satu lokasi favorit para pecinta alam yang hobi mendaki gunung dan menikmati keindahan matahari terbit di puncaknya. Harga tiket masuk kawasan wisata Gunung Merapi adalah 3,000 Rupiah per orang.",
            "Candi Borobudur yang berlokasi di Magelang adalah salah satu primadona wisata di sekitar Yogyakarta. Terkenal hingga ke berbagai belahan dunia, Candi Borobudur merupakan sebuah candi Buddha yang paling besar di dunia. Berlokasi sekitar 40 KM dari Yogyakarta, Candi Borobudur saat ini masih dikunjungi biksu yang berziarah karena Candi Borobudur adalah sebuah monumen model dari alam semesta yang merupakan tempat suci. Untuk dapat masuk ke area Candi Borobudur, anda diharuskan menggunakan sarung yang akan dipinjamkan di pintu masuk Candi Borobudur. Candi Borobudur merupakan candi yang mempunyai relief dan patung Buddha terbanyak di dunia. Walaupun bukan berada di Jogja, Candi Borobudur selalu didatangi oleh wisatawan yang berkunjung ke Jogja.",
            "stana Air Taman Sari adalah sebuah tempat rekreasi dan meditasi bagi keluarga kerajaan Yogyakarta pada jaman dahulu. Selain itu, Istana Air Taman Sari juga berfungsi sebagai benteng pertahanan terhadap musuh yang menyerang. Saat ini, Istana Air Taman Sari adalah salah satu tempat wisata di Yogyakarta yang terkenal karena keunikannya. Udara di sekitar Istana Air Taman Sari juga sejuk karena terdapat banyak kolam buatan disertai dengan kebun bunga yang berbau harum. Harga tiket masuk Istana Air Taman Sari adalah 5,000 Rupiah."

    };

    private static String[] Location = {
            "Jl. Raya Solo - Yogyakarta No.16, Kranggan, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571",
            "25 KM di selatan pusat kota Yogyakarta",
            "Jl. Malioboro, Yogyakarta",
            "Jetis Wetan, Pacarejo, Kec. Semanu, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55893",
            "Jl. Sendangsono No.KM. 0.2, Kanden, Progowati, Mungkid, Magelang, Jawa Tengah 56512",
            "Kecamatan Kraton, Kota Yogyakarta",
            "Jl. Kebun Raya No.2, Rejowinangun, Kec. Kotagede, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55171",
            "Dusun 2, Suroteleng, Selo, Kabupaten Boyolali, Jawa Tengah",
            "Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah",
            "Wisata Taman Sari Jalan Tamanan, Patehan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55133"
    };

    private static int[] Images = {
            R.drawable.prambanan,
            R.drawable.parangtritis,
            R.drawable.malioboro,
            R.drawable.jomblang,
            R.drawable.citraelo,
            R.drawable.kraton,
            R.drawable.gembiraloka,
            R.drawable.merapi,
            R.drawable.borobudur,
            R.drawable.tamansari
    };

    static ArrayList<ObjekWisata> getListData(){
        ArrayList<ObjekWisata> list = new ArrayList<>();
        for(int position = 0; position < Names.length; position++){
            ObjekWisata linux = new ObjekWisata();
            linux.setName(Names[position]);
            linux.setLocation(Location[position]);
            linux.setDetail(Details[position]);
            linux.setPhotos(Images[position]);
            list.add(linux);
        }
        return list;
    }
}
