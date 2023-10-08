# tpcalc
This is a sample Thara Palan application. Thara Palan means the fruits of a Star. 
In Vedic Astronomy/Astrology there are 27 Tharas or [Nakshatras](https://en.wikipedia.org/wiki/Nakshatra) (Lunar Mansions). Moon resides on one of these mansions on a daily basis. The mansion or Nakshatra in which Moon resides on any given day is the Thara or Star for that day. The Nakshatra on the day on which an individual had born is their birth star (or Janma Nakshatra). There is a relationship between your Janma Nakshatra and the rest of the Nakshatras and the nature of the relationship is governed by the prinicple of Thara Palan.

## More Details on the computation of Thara Palan
Thara palan of the day for an individual is computed by calculating the difference between the Nakshatra positions. These are Nakshatrams and the order:
1. Ashwini
1. Bharani
1. Kruthika
1. Rohini
1. Mrigashirsham
1. Ardra
1. Punarvasu
1. Pushyam
1. Ashlesham
1. Magham
1. Purva Phalguni
1. Uttara Phalguni
1. Hastam
1. Chitra
1. Svati
1. Vishakham
1. Anuradha
1. Jyeshtha
1. Mulam
1. Purva Ashadha
1. Uttara Asadha
1. Shravanam
1. Shravishtam
1. Sadhayam
1. Puratadhi
1. Uttaratadhi
1. Revati

Using this order above, the relative difference of the Nakshatrams are found and moded by 9. The resulting number is mapped to the palan:

| Number   | Thara Palan         | Implication     |
| -------- | ------------------- | ----------------|
| 1        | Janma Thara         | Not Good        |
| 2        | Sampath Thara       | Good            |
| 3        | Vipath Thara        | Not Good        |
| 4        | Kshema Thara        | Good            |
| 5        | Prathyak Thara      | Not Good        |
| 6        | Sadaka Thara        | Good            |
| 7        | Vadha Thara         | Not Good        |
| 8        | Mithra Thara        | Good            |
| 9        | Athimithra Thara    | Good            |
| -1       | Error               | Internal        |

For eg. If today's Nakshatram is "Revati" and the user's Nakshatram is "Shravanam", then application will determine the difference between the Nakshatram which is 6 and mod it by 9 and results in 6. From the Tharapalan table above, we can see that the palan is Sadaka Thara, which implies that it is a good day for the user.

## Why we have mod by 9 and what is its significance
<TDB>
