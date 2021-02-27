package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Sex.MALE
import com.example.androiddevchallenge.data.Sex.FEMALE

object PuppyList {
    val data = listOf(
        Puppy(
            id = 1,
            name = "Emily",
            breed = "Pit Bull Terrier Mix",
            color = "White / Cream",
            size = "Medium",
            sex = FEMALE,
            age = "8 weeks",
            description = "Emily, female, seven weeks old. She is currently 7 pounds. Very active. Loves tug-a-war and wrestling with whoever is willing. She's quite spunky.\n" +
                    "\n" +
                    "Emily is located in Cashmere, WA. If you are interested please complete our application at Okandogs.com.\n",
            location = "Cashmere, WA",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date",
            image = R.drawable.puppy1
        ),
        Puppy(
            id = 2,
            name = "Bella",
            breed = "Belgian Shepherd / Malinois Mix",
            color = "Bicolor",
            size = "Medium",
            sex = FEMALE,
            age = "7 weeks",
            description = "Bella is the smallest of her litter but she is a bit sassy and independent. Bella is just seven weeks old and will be adoptable on 1/29/21.She and her littermates are already showing signed of house training, very smart pups.\n" +
                    "\n" +
                    "Previous Malinois experience preferred.",
            location = "Cashmere, WA",
            characteristics = "smart, sassy, leader",
            health = "Vaccinations up to date",
            image = R.drawable.puppy2
        ),
        Puppy(
            id = 3,
            name = "Kiwi",
            breed = "Chihuahua Mix",
            size = "Small",
            sex = MALE,
            age = "8 weeks",
            description = "Say hello to Kiwi! Kiwi is a female chihuahua mix who is 8-week-old and weighs 2.4 pounds. This beautiful little girl was found as a stray with her sister and mom just over a week ago. The two little girls had wandered from their mom but luckily were spotted a short time later and all three were brought to Wags to Riches and placed into an amazing foster.\n" +
                    "\n" +
                    "Kiwi’s foster family describes her as spunky and playful. She loves to play with toys and with her NINE other foster brothers and sisters!",
            location = "Union Gap, WA",
            health = "Vaccinations up to date",
            image = R.drawable.puppy3
        ),
        Puppy(
            id = 4,
            name = "Ramen",
            breed = "Terrier Mix",
            color = "Yellow / Tan / Blond / Fawn",
            size = "Small",
            sex = MALE,
            age = "6 months",
            description = "Meet Ramen, a five-and-a-half-month-old Terrier mix.\n" +
                    "\n" +
                    "Ramen came in with ten other dogs who were reportedly dumped on someone's property during the snowstorm. He doesn't appear to have been handled or held very much and piddles when you pick him up. He would love to go to a home with shy dog experience and experience socializing nervous pups. He would probably do well in a home with another well-socialized dog who he could lean on for support and follow their lead. Due to Ramen being so unsure right now we recommenced he goes to a home with no young kids. Please remember that Ramen is a puppy and puppy behavior comes with the package. They need basic training and potty training along with being provided chew toys to encourage proper chewing habits. All puppies require socializing from a young age to help them become the best, most well-rounded dog they can be.",
            location = "Yakima, WA",
            health = "Vaccinations up to date, spayed / neutered.",
            image = R.drawable.puppy4
        ),
        Puppy(
            id = 5,
            name = "Bonsai",
            breed = "Pit Bull Terrier",
            color = "Gray / Blue / Silver",
            age = "7 weeks",
            size = "Medium",
            sex = MALE,
            description = "Bonsai was dumped by a local breeder because he is special needs. Luckily our vet called us and asked us to take him in. After a visit to the neurologist, it was discovered that he has Cerebellar Hypoplasia, which is a disease that denotes an inadequate development of the cerebellum. The cerebellum in dogs is a section of the brainstem largely responsible for modulating motor impulses. This will be something that can improve over time with lots of love, rehab, dedication and care, but not cured.",
            location = "Leona Valley, CA",
            characteristics = "Playful, Cuddly, Active ",
            health = "Vaccinations up to date, special needs. Bonsai has Cerebellar Hypoplasia.",
            image = R.drawable.puppy5
        ),
        Puppy(
            id = 6,
            name = "Buzz",
            breed = "Dachshund Mix",
            size = "Medium",
            sex = MALE,
            age = "6 weeks",
            description = "Buzz is of one of Slinky's 7 dachshund mix puppies. He is the only one who is all tan and is one of the biggest at about 15 lbs. To strangers he can be a shy and timid pup who is reserved and will bark to vocalize he is nervous. He would like a home with another dog. He especially likes dogs that he can be a \"big brother\" to. He prefers dogs his size or smaller. He's going through the puppy stage of always wanting something in his mouth",
            location = "Apple Valley, C",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date, spayed / neutered.",
            image = R.drawable.puppy6
        ),
        Puppy(
            id = 7,
            name = "Amber",
            breed = "Cattle Dog Mix",
            color = "Bicolor, Black",
            size = "Medium",
            sex = FEMALE,
            age = "8 weeks",
            description = "Amber is the sweetest, most friendly and playful puppy you’ll ever have the pleasure to meet!\n" +
                    "\n" +
                    "Her mom is a red heeler mix (cattle dog) and she and her two siblings are the last ones available from a litter of ten adorable puppies.\n" +
                    "\n" +
                    "Amber is almost eight weeks old and looking for her furever home.",
            location = "Van Nuys, CA",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date",
            image = R.drawable.puppy7
        ),
        Puppy(
            id = 8,
            name = "Batman",
            breed = "Husky Mix",
            color = "Black, White / Cream",
            size = "Large",
            sex = MALE,
            age = "10 months",
            description = "Batman is 10months old puppy! His family can no longer care for him so he is looking for a new loving family so he can continue his beautiful life journey!\n" +
                    "Batman is a wonderful young pup, who loves to play and human attention! He is dog friendly (including small dogs) and kid-friendly. He enjoys running around in a yard but also likes to be inside to curly up with his hooman. Only 10 months old, Batman is already a big boy at 62lbs! He is quite obedient, he knows sit and stay, like his current family says, “I can leave the back door open and if I say.....sit batman....he sits. Then I say Stay! And he will stay right there with the door open.” Batman is very loving and affectionate! He does not like to be left alone and does require more house training as he is still a puppy but he is fully potty trained. Batman will be the perfect addition to an active family with a yard, who can take him on daily walks and exercise.",
            location = "Glendora, CA",
            characteristics = "Loving, Affectionate, Friendly, Playful, Energetic",
            health = "Vaccinations up to date",
            image = R.drawable.puppy8
        ),
        Puppy(
            id = 9,
            name = "Electra",
            breed = "Cattle Dog & Labrador Retriever Mix",
            color = "Brindle, Red / Chestnut / Orange, Tricolor (Brown, Black, & White)",
            size = "Medium",
            sex = FEMALE,
            age = "10 weeks",
            description = "Imagine your home with the loveliest pair of puppy dog eyes looking back at you from every room. The best part about adopting a puppy is seeing them enjoy all of the new things the world has to offer. They will need time, energy, and patience to help them become the best family pets they can be, so if you’re up for a challenge and a lot of fun, consider adopting one!\n" +
                    "\n" +
                    "Electra is a high energy pup that needs further manners and obedience training and guidance. She does not do well with other dogs and we suggest she go to a home without cats. She is a loving girl who can go to a home with older children (12+). She is not yet house trained but with consistency, she will be in no time.",
            location = "Chicago, IL",
            characteristics = "high energy, loving, working,",
            health = "Vaccinations up to date, spayed / neutered.",
            image = R.drawable.puppy9
        ),
        Puppy(
            id = 10,
            name = "Rockstar",
            breed = "Boxer Mix",
            color = "Brown / Chocolate",
            size = "Large",
            sex = MALE,
            age = "6 months",
            description = "Hey, I am the one and only Rockstar born around 15/8/20. You want sweetness-- that is me. You want friendly-- that is me. You want a best friend -- that is me. You want to come and meet me,",
            location = "West Chicago, IL",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date",
            image = R.drawable.puppy10
        ),
        Puppy(
            id = 11,
            name = "Cato",
            breed = "Mountain Dog Mix",
            color = "Brown / Chocolate",
            size = "Medium",
            sex = MALE,
            age = "7 months",
            description = "Shy little Cato is a bit of a blank slate and needs some basic training but he is full of life and loves to play. He adores his person but is a little skittish and timid when on walks and hears loud noises so he needs to be kept securely on leash at all times. With proper exercise Cato is a very calm and well behaved boy in the home. He has gone on a 4 mile hike and did amazing. He truly adores his walks a lot but does pull out of excitement so we’re working on that. He is in fact house trained if placed on a schedule. Cato also adores other dogs and takes cues well so if a dog wants space, he knows to give it. We do want him in a home with a dog that is playful and well-adjusted",
            location = "Los Angeles, CA",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date",
            image = R.drawable.puppy11
        ),
        Puppy(
            id = 12,
            name = "Nova",
            breed = "Australian Cattle Dog / Blue Heeler Mix",
            color = "Merle (Red)",
            size = "Medium",
            sex = FEMALE,
            age = "5 months",
            description = "This is Nova! She is a 5 month old cattle dog/beagle mix! She is playful, sweet and is looking for someone with a lot of time to give her the training and socialization she needs! She would love a home with another dog and children 14 and over",
            location = "Beverly Hills, CA",
            characteristics = "active, playful, spunky",
            health = "Vaccinations up to date",
            image = R.drawable.puppy12
        ),
    )

    fun getById(id: Int): Puppy {
        return data.filter { it.id == id }[0]
    }
}