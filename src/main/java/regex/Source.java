package regex;

public class Source {

    static String source = "<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_kujawsko-pomorskie\\\" title=\\\"Województwo kujawsko-pomorskie\\\">kujawsko-pomorskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Bydgoszcz\\\" title=\\\"Bydgoszcz\\\">Bydgoszcz</a> ¹<br /><a href=\\\"/wiki/Toru%C5%84\\\" title=\\\"Toruń\\\">Toruń</a> ²\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">17&#160;972\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">2&#160;077&#160;775\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>115,62\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">59,09%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">9,2%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">41 875\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">C\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>06\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_lubelskie\\\" title=\\\"Województwo lubelskie\\\">lubelskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Lublin\\\" title=\\\"Lublin\\\">Lublin</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">25&#160;122\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">2&#160;117&#160;629\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>84,29\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">46,46%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">8,4%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">35 712\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">L\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>08\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_lubuskie\\\" title=\\\"Województwo lubuskie\\\">lubuskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Gorz%C3%B3w_Wielkopolski\\\" title=\\\"Gorzów Wielkopolski\\\">Gorzów Wielkopolski</a> ¹<br /><a href=\\\"/wiki/Zielona_G%C3%B3ra\\\" title=\\\"Zielona Góra\\\">Zielona Góra</a> ²\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">13&#160;988\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">1&#160;014&#160;548\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>72,53\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">64,95%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">6,2%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">42 755\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">F\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>10\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_%C5%82%C3%B3dzkie\\\" title=\\\"Województwo lodzkie\\\">łódzkie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/%C5%81%C3%B3d%C5%BA\\\" title=\\\"Łódź\\\">Łódź</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">18&#160;219\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">2&#160;466&#160;322\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>135,37\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">62,55%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">6,3%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">48 126\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">E\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>12\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_ma%C5%82opolskie\\\" title=\\\"Województwo malopolskie\\\">małopolskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Krak%C3%B3w\\\" title=\\\"Kraków\\\">Kraków</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">15&#160;183\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">3&#160;400&#160;577\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>223,98\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">48,19%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">4,9%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">47 272\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">K\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>14\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_mazowieckie\\\" title=\\\"Województwo mazowieckie\\\">mazowieckie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Warszawa\\\" title=\\\"Warszawa\\\">Warszawa</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">35&#160;558\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">5&#160;403&#160;412\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>151,96\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">64,40%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">5,1%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">83 123\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">W\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>16\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_opolskie\\\" title=\\\"Województwo opolskie\\\">opolskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Opole\\\" title=\\\"Opole\\\">Opole</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">9412\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">986&#160;506\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>104,82\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">53,30%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">6,6%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">41 080\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">O\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>18\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_podkarpackie\\\" title=\\\"Województwo podkarpackie\\\">podkarpackie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Rzesz%C3%B3w\\\" title=\\\"Rzeszów\\\">Rzeszów</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">17&#160;846\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">2&#160;129&#160;015\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>119,30\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">41,09%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">9,1%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">36 088\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">R\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>20\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_podlaskie\\\" title=\\\"Województwo podlaskie\\\">podlaskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Bia%C5%82ystok\\\" title=\\\"Białystok\\\">Białystok</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">20&#160;187\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">1&#160;181&#160;533\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>58,53\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">60,79%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">8,1%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">37 077\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">B\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>22\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_pomorskie\\\" title=\\\"Województwo pomorskie\\\">pomorskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Gda%C5%84sk\\\" title=\\\"Gdańsk\\\">Gdańsk</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">18&#160;321\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">2&#160;333&#160;523\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>127,44\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">63,66%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">5,2%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">50 001\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">G\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>24\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_%C5%9Bl%C4%85skie\\\" title=\\\"Województwo slaskie\\\">śląskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Katowice\\\" title=\\\"Katowice\\\">Katowice</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">12&#160;333\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">4&#160;533&#160;565\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>367,59\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">76,73%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">4,5%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">53 654\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">S\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>26\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_%C5%9Bwi%C4%99tokrzyskie\\\" title=\\\"Województwo swietokrzyskie\\\">świętokrzyskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Kielce\\\" title=\\\"Kielce\\\">Kielce</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">11&#160;711\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">1&#160;241&#160;546\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>106,02\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">44,86%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">8,7%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">36 970\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">T\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>28\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_warmi%C5%84sko-mazurskie\\\" title=\\\"Województwo warminsko-mazurskie\\\">warmińsko-mazurskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Olsztyn\\\" title=\\\"Olsztyn\\\">Olsztyn</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">24&#160;173\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">1&#160;428&#160;983\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>59,11\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">58,99%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">10,9%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">36 306\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">N\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>30\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_wielkopolskie\\\" title=\\\"Województwo wielkopolskie\\\">wielkopolskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Pozna%C5%84\\\" title=\\\"Poznań\\\">Poznań</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">29&#160;826\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">3&#160;493&#160;969\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>117,14\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">54,27%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">3,3%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">56 496\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"center\\\">P\\n\" +\n" +
            "            \"</td></tr>\\n\" +\n" +
            "            \"<tr>\\n\" +\n" +
            "            \"<td>32\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Wojew%C3%B3dztwo_zachodniopomorskie\\\" title=\\\"Województwo zachodniopomorskie\\\">zachodniopomorskie</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td><a href=\\\"/wiki/Szczecin\\\" title=\\\"Szczecin\\\">Szczecin</a>\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">22&#160;897\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">1&#160;701&#160;030\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td>74,31\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">68,50%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">7,8%\\n\" +\n" +
            "            \"</td>\\n\" +\n" +
            "            \"<td align=\\\"right\\\">43 150";
}
