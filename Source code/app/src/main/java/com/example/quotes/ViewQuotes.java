package com.example.quotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

public class ViewQuotes extends AppCompatActivity {
    Toolbar t1;
    RecyclerView r1;
    String[] item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_quotes);
        t1 = (Toolbar) findViewById(R.id.quotes_heading);
        Intent intent = getIntent();
        String lang=intent.getStringExtra("language");
        String title = intent.getStringExtra("heading");
        if (title.equals("Birthday")) {

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);

            if(lang.equals("E N G L I S H")) {


                String[] qut_item = {"“Count your life by smiles, not tears. Count your age by friends, not years. Happy birthday!”"
                        , "“Happy birthday! I hope all your birthday wishes and dreams come true.”"
                        , "“A wish for you on your birthday, whatever you ask may you receive, whatever you seek may you find, whatever you wish may it be fulfilled on your birthday and always. Happy birthday!”"
                        , "“ Another adventure filled year awaits you. Welcome it by celebrating your birthday with pomp and splendor. Wishing you a very happy and fun-filled birthday!”"
                        , "“May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!”"
                        , "“Happy birthday! Your life is just about to pick up speed and blast off into the stratosphere. Wear a seat belt and be sure to enjoy the journey. Happy birthday!”",
                        "“This birthday, I wish you abundant happiness and love. May all your dreams turn into reality and may lady luck visit your home today. Happy birthday to one of the sweetest people I’ve ever known.”",
                        "“May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.”",
                        "“Count not the candles…see the lights they give. Count not the years, but the life you live. Wishing you a wonderful time ahead. Happy birthday.”",
                        "“Birthdays are a new start, a fresh beginning and a time to pursue new endeavors with new goals. Move forward with confidence and courage. You are a very special person. May today and all of your days be amazing!”"};

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String[] qut_item={"“फूलो सा महकता रहे हमेशा जीवन तुम्हारा,\n" +
                        "खुशिया चूमे कदम तुम्हरे बहुत सारा प्यार और\n" +
                        "आशीर्वाद हमारा HAPPY BIRTHDAY”",
                        "“हर राह आसन हो,\n" +
                                "हर राह पे खुशिया हो,\n" +
                                "हर दिन ख़ूबसूरत हो,\n" +
                                "ऐसा ही पूरा जीवन हो,\n" +
                                "यही हर दिन मेरी दुआ हो,\n" +
                                "ऐसा ही तुम्हारा हर जन्मदिन हो....!!”",
                        "“फूलों ने अमृत का जाम भेजा है,\n" +
                                "सूरज ने गगन से सलाम भेजा है,\n" +
                                "मुबारक हो आपको नया जन्मदिन,\n" +
                                "तहे-दिल से हमने ये पैगाम भेजा है..”",
                        "“ऐ खुदा, मेरे यार का दामन खुशियों से सजा दे,\n" +
                                "उसके जन्मदिन पर उसकी कोई रज़ा दे,\n" +
                                "दर पर आऊंगा तेरे मैं हर साल,\n" +
                                "की उसको गिले की कोई वजह न दे..”",
                        "“जन्मदिन की तो पार्टी होनी चाहिए,\n" +
                                "Wish तो Morning की भी होती है.”",
                        "“जन्मदिन तुम्हे मुबारक हो..\n" +
                                "हर दिन युही खुस रहो...\n" +
                                "खुशियाँ और तरक्की तुम्हारे साथ हो...\n" +
                                "हर साल जन्मदिन मानते रहो...”"
                      };
                item = qut_item;
            }
            else
            {
                String[] qut_item={"“જન્મદિવસ ની શુભકામના! તમારી પાસે ઊર્જા અને જીવન માટેનો પ્રેમ હોવો જોઈએ. તમારી યુવાનીનો આનંદ માણો અને હંમેશા તમારા ચહેરા પર સ્મિત દર્શાવો, પણ ખરાબ સમયમાં.”",
                        "“સદાકાળ સુખ અને આનંદ, અનંત નસીબ અને સમૃદ્ધિ, રોજિંદા આનંદ અને મજા! આ મારા જન્મદિવસની શુભેચ્છાઓ છે મારા જન્મદિવસની શુભેચ્છાઓ!”",
                        "“તમે પહેલાં સો લોકોને નમસ્કાર કરવાનો પ્રયાસ કરી રહ્યાં છો હવે તે શુભેચ્છાઓ તમને પાછા લાવવાનો સમય છે. અમે તમને મિત્ર પ્રેમ જન્મદિવસ ની શુભકામના!”",
                        "“તમારી દયાળુ હૃદય તમારા આત્માને તેજસ્વી બર્ન કરે છે. તમારા ખાસ દિવસ પર, હું તમને મારી પ્રાર્થનાઓ મોકલીશ જેથી તમે બીજાઓ માટે જીવનનો પ્રકાશ ચમકવો ચાલુ રાખી શકો.”",
                        "“તમે કદાચ એક કે બે વાર વિચાર કર્યો હશે કે તમારા જીવનનો શ્રેષ્ઠ દિવસ ભૂતકાળમાં છે, પરંતુ તે હજી સુધી લખીશ નહીં. ખુશ, ખુશ જન્મદિવસ અને આવવા વધુ આશીર્વાદ”",
                        "“આ વિશિષ્ટ દિવસ ભગવાન છે એમ કહેવાની પોતાની રીત છે કે તે તમને ખૂબ જ પ્રેમ કરે છે અને તે ઇચ્છે છે કે તમે એક સારા બાળક હોવ. એક સુખી જન્મદિવસ છે મારા પ્રિય મિત્ર”",
                        "“આજે મારા એક વ્યક્તિ માટે એક ખાસ દિવસ છે. જે વ્યક્તિ હંમેશાં મને ખુબ ખુશી અને ગૌરવ આપે છે કે હું હંમેશાં દરેકને કહેવું \"તે મારો છોકરો છે!\" હેપી બર્થ ડે પુત્ર ભગવાન તમને મારા પુત્ર તરીકે આપ્યો છે, હું તમારી માતા બનવા માટે આભારી છું, અને તમે એક મહાન માણસ તરીકે વધવા પડશે કેવી રીતે આશા છું કે કેવી રીતે હું ખુશ છું તે દર્શાવવા માટે શબ્દો પૂરતી નથી. જન્મદિવસની શુભેચ્છાઓ અને હું તમને શ્રેષ્ઠ શુભેચ્છાઓ આપું છું.  એક નાનો છોકરોથી ઉગાડવા માટે, હું તમને ગૌરવ અનુભવું છું કે તમે કોણ છો જન્મદિવસની શુભેચ્છાઓ  તમે ક્યારેય પણ ઉદાર છો, પરંતુ એક દિવસ વધુ પરિપક્વ નથી તમારા પુત્રને ખુશ જન્મદિવસ”",
                        "“હું કેવી રીતે ઈચ્છુ છું કે હું તમને હમણાં ઉડી શકું અને તમારી સાથેના આ વિશિષ્ટ દિવસ પર તમારી સાથે હોઈશ. પરંતુ યાદ રાખો, મારી શુભેચ્છા હંમેશા તમારી સાથે છે. જન્મદિવસ ની શુભકામના!”",
                        "“તમારા જેવા વ્યક્તિ જીવનમાં સર્વશ્રેષ્ઠ શ્રેષ્ઠ છે. હું ભગવાનને પ્રાર્થના કરું છું કે તમે જીવનની બધી ભલાઈથી આશીર્વાદ આપો. પ્રિય તમને જન્મદિવસની શુભેચ્છા!”",
                        "“તમે જીવનમાં સૂર્યપ્રકાશ અને મેઘધનુષ્ય સાથે આશીર્વાદ મેળવી શકો છો. જન્મ દિવસ ની શુભેચ્છાઓ વહાલા!”",
                        "“તમે મારા માટે આશીર્વાદ છે. તેથી, આ દિવસ મારા માટે અગત્યનું છે કારણ કે તે તમને મારા પ્રિય પ્રેમ છે. જન્મદિવસ ની શુભકામના!”","“અહીં હું જાણું છું કે સૌથી સુંદર વ્યક્તિ માટે હૂંફ, પ્રેમ અને આશીર્વાદથી સંપૂર્ણ સાદી ટેક્સ્ટ મોકલી રહ્યું છે! જન્મદિવસની શુભેચ્છા”",
                        "“જ્યારે તમે જન્મ્યા હતા ત્યારે વરસાદ થવો જોઈએ. આશ્ચર્ય શા માટે? કારણ કે બધા એન્જલ્સ રુદન હોવા જ જોઈએ તેમના શ્રેષ્ઠ સ્ટાર પૃથ્વી પર મોકલવામાં આવી હતી. તમે શ્રેષ્ઠ સ્ટાર છો! જન્મદિવસ ની શુભકામના!”"};
                item = qut_item;
            }

            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));


        }
        else if(title.equals("Inspiration")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“If you are always trying to be normal, you will never know how amazing you can be.”"
                        , "“Everyday may not be a good day but there is good in every day.”"
                        , "“Manure, of very little use except it be spread.”"
                        , "“Motivation is the art of getting people to do what you want them to do because they want to do it.”"
                        , "“People share their wisdom in the hopes of making a difference in other people's lives.”"
                        , "“If we have the attitude that it is going to be a great day it usually is. ”"
                        , "“The truly rich are those who enjoy what they have.”"
                        , "“The advantage of being eighty years old is that one has many people to love.”"
                        , "“When you have faith, everything is possible. ”"
                        , "“If God shuts one door he opens another. ”"
                        , "“Empty pockets never held anyone back. Only empty heads and empty hearts can do that.”"
                        , "“Good coaching is good teaching and nothing else.”"
                        , "“A problem is a chance for you to do your best.”"
                        , "“I aspire to inspire before I expire.”"
                };

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“    आप हमेशा इतने छोटे बनिये की\n" +
                        "    हर व्यक्ति आपके साथ बैठ सके,\n" +
                        "    और आप इतने बड़े बनिये की\n" +
                        "    आप जब उठे तो कोई बैठा न रहे।”",
                        "“ज़िंदगी जीना आसान नहीं होता; बिना संघर्ष के कोई महान नहीं होता; जब तक न पड़े हथौड़े की चोट; पत्थर भी भगवान नहीं होता।”",
                        "“किसी के पैरों में गिरकर कामयाबी पाने से बेहतर है अपने पैरों पर चलकर कुछ बनने की ठान लो।”",
                        "“मेहनत इतनी खामोशी से करो कि सफलता शोर मचा दे।”",
                        "“ज़िन्दगी बदलने के लिए लड़ना पड़ता है और आसान करने के लिए समझना पड़ता है”",
                        "“कम्फर्ट जोन से बाहर निकालिए, आप तभी आगे बढ़ सकते है जब आप कुछ नया आज़माने को तैयार है।”",
                        "“समझनी है ज़िन्दगी तो पीछे देखो, जीनी है ज़िन्दगी तो आगे देखो ।”",
                        "“जीवन मे सबसे बड़ी ख़ुशी उस काम को करनें में है, जिसे लोग कहते है कि आप नहीं कर सकते।”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"“⏳ *સમય કયારેય ખરાબ હોતો નથી*.....\n" +
                        "\n" +
                        "પણ આપણી *ઈચ્છા* સમય સાથે પૂરી ન થાય એટલે  *''સમય''* ખરાબ લાગે છે.⏱️”",
                        "“*છે એક સરખી જ સામ્યતા* \n" +
                                "*પતંગ અને જિંદગીની,*\n" +
                                "*ઉંચાઈ પર હોય* \n" +
                                "*ત્યાં સુધી જ વાહ વાહ થાય છે.*”",
                        "“\uD83D\uDCF1સેલ્ફી નહીં પણ ક્યારેક કોઈકનું \n" +
                                "\uD83D\uDE1Eદુઃખ ખેચી શકો તો કોશિશ કરજો,\n" +
                                "સાહેબ \n" +
                                "\uD83C\uDF0Dદુનિયા તો શું \uD83C\uDF1Fભગવાન ખુદ \n" +
                                "એ ફોટો \uD83D\uDC4DLike કરશે !!”",
                        "“✍️ ખૂબ જ સુંદર મેસેજ:\n" +
                                "\n" +
                                "હુ દુનિયા સામે લડી શકુ છુ પણ, \n" +
                                "\n" +
                                "મારા અંગત \uD83D\uDC6Bલોકો સામે લડી શક્તો નથી.... \n" +
                                "કારણ કે......\n" +
                                "એમની સાથે મારે \uD83D\uDCAA''જીતવુ'' નથી \n" +
                                "પણ \uD83D\uDC68\uD83D\uDC68\uD83D\uDC67\uD83D\uDC67''જીવવુ'' છે......”",
                        "“સાચી દિશા અને સાચા સમય નું જ્ઞાન ન હોય તો \n" +
                                "આપણને ઉગતો સુરજ પણ આથમતો દેખાય....”",
                       };
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        } else if(title.equals("Cute")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“Cute is when a person’s personality shines through their looks.”"
                        , "“The only rule is don’t be boring and dress cute wherever you go. Life is too short to blend in.”"
                        , "“Don’t try to be what you’re not. If you’re nervous, be nervous. If you’re shy, be shy. Its cute.”"
                        , "“Always wear cute pajamas to bed, you’ll never know who u will meet in your dreams.”"
                        , "“Everything looks cute when it’s small.”"
                        , "“There’s nothing that can help you understand your beliefs more than trying to explain them to an inquisitive child.”"
                        , "“Whatever you are, be a good one.”"
                        , "“Wherever you go, go with all your heart.”"
                        , "“You don’t need really expensive clothes to look cute.”"
                        , "“Walking with a friend in the dark is better than walking alone in the light.”"
                        , "“We were together. I forget the rest.”"
                        , "“Things change, people change, but you will always be you, so stay true to yourself and never sacrifice who you are for anyone.”"
                        , "“A real girl isn’t perfect and a perfect girl isn’t real.”"
                        , "“Live life to the fullest.”"
                        , "“Life must be lived as play.”"
                };

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“ज़िन्दगी में इंसान बस दो ही चीजों से हारता है, एक समय, जो कभी किसी के लिए नहीं रुकता, और दूसरा प्यार जो हर किसी के नसीब में नहीं होता”",
                        "“किसी भी चीज को सुधरने के लिए ज़िन्दगी हमें हमेशा दूसरा मौका देती है, जिसे हम #Tomorrow कहते है”",
                        "“नाम हमेशा उसी का होती है जो काम करता है, बेकार लोगो की ज़िन्दगी तो दूसरों की बुराइयां और खामियां ढूंढ़ने में ही खत्म हो जाता है”",
                        "“बुरे लोगो के विचारो को कभी अपने मन में जगह मत दो, अपना दिमाग इस्तेमाल करो और अपने विचारो से उनके दिमाग में जगह बनाओ”",
                        "“अपने दूर चले जाये तो कोई बात नहीं, पर जब अपने बेगानो जैसे हो जाए तो, अंदर तक तकलीफ देते है”",
                        "“जब आपको मनचाही चीज मिल जाये तो, उसे छोड़ कर उससे भी अच्छी चीज को ढूंढ़ने में मत लगिए”",
                        "“कुछ सबक सीखना ही है तो वक़्त से सीखो, जो कभी अपने आप को बदलते नहीं थकता”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"“\uD83D\uDC49 આજે બિમારી નુ ચેક અપ કરાવી આવ્યો છુ,, દવા મા તારુ \uD83D\uDC70 નામ લખાવી \uD83D\uDD8E લાવ્યો છુ \uD83D\uDC48”",
                        "“\uD83D\uDC49 ” દિલ થી ન ❎ રમ,, દિલ \uD83D\uDC9F છે નરમ \uD83E\uDD17 ” \uD83D\uDC48”",
                        "“\uD83D\uDC49 ” મારા સ્વપ્ન ઉપર એ હસી \uD83D\uDC81… પણ,, મારું સ્વપ્ન જ… એનું હાસ્ય હતું \uD83E\uDD17 ” \uD83D\uDC48”",
                        "“\uD83D\uDC49 ” તું \uD83D\uDC78એટલે… આકાશેથી ખરતાં તારાઓને \uD83C\uDF03 જોઈ, માંગેલી… ખુબસૂરત ખ્વાહીશ…!!! ” \uD83D\uDC48”",
                        "“\uD83D\uDC49 પ્રેમ એટલે પહેલી નજરે જોતાં જ \uD83D\uDC41 એની સાથે \uD83D\uDC49\uD83D\uDC81જ જીવન વિતાવવાનો ” મન ” નો નિર્ણય… \uD83D\uDC48”",
                        "“\uD83D\uDC49 ” કોઈની લાગવગની જરુર નથી.. તારી સાથેનો પ્રેમનો \uD83D\uDC91 કેસ હું જાતે જ જીતી ✌ લઈશ. ” \uD83D\uDC48”",
                        "“” તું યાદોમાં \uD83D\uDE47 આવી રોજ રોજ મારી જોડે વાત ના કર..♡ હવે લોકો આવીને પૂછે છે \uD83D\uDC9C એકલા એકલા કેમ હસો છો..♡♡ “”"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        } else if(title.equals("Funny")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
            String qut_item[]={"“Better to remain silent and be thought a fool than to speak out and remove all doubt.”"
            ,"“If I were two-faced, would I be wearing this one?”"
            ,"“The best thing about the future is that it comes one day at a time.”"
            ,"“The only mystery in life is why the kamikaze pilots wore helmets.”"
            ,"“Light travels faster than sound. This is why some people appear bright until you hear them speak.”"
            ,"“Nobody realizes that some people expend tremendous energy merely to be normal.”"
            ,"“Men marry women with the hope they will never change. Women marry men with the hope they will change. Invariably they are both disappointed.”"
            ,"“The difference between stupidity and genius is that genius has its limits.”"
            ,"“All the things I really like to do are either immoral, illegal or fattening.”"
            ,"“War is God’s way of teaching Americans geography.”"
            ,"“It would be nice to spend billions on schools and roads, but right now that money is desperately needed for political ads.”"
            ,"“The average dog is a nicer person than the average person.”"
            ,"“At every party there are two kinds of people – those who want to go home and those who don’t. The trouble is, they are usually married to each other.”"
            };

            item=qut_item;}
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“घर की इज्जत बेटियों के हाथ में होती है और प्रॉपर्टी के कागज़ नालायकों के हाथ में \uD83D\uDE02\uD83D\uDE1D\uD83D\uDE02”",
                        "“हर किसी को एक बार तो प्यार करना ही चाहिए… ताकि उसको पता चल सके कि प्यार क्यों नहीं करना चाहिए…\uD83D\uDE02”",
                        "“आज पुरानी GF मिली बाज़ार में… मैं उसे “हलो कहने ही वाला था,कि उसके पति ने “चलो” कह दिया…\uD83D\uDE04\uD83D\uDE05\uD83D\uDE04\uD83D\uDE05..”",
                        "“बहुत मुश्किल से crush ने friend request accept की थी, दोस्तों ने भाभी भाभी comment कर के block करवा दिया \uD83D\uDE02\uD83D\uDE1D\uD83D\uDE02”",
                        "“ना इश्क़ में ना जुदाई में, बहुत दर्द है दिवाली की साफ़ सफाई में \uD83D\uDE1C\uD83D\uDE1C”",
                        "“शादी तो उसी से करूँगा जो सुबह उठ कर पूछे जानू चाय की पप्पी \uD83D\uDE02\uD83D\uDE1D\uD83D\uDE02”",
                        "“पाप धोने है कौन सा साबुन अच्छा रहेगा \uD83D\uDE04\uD83D\uDE05\uD83D\uDE04\uD83D\uDE05”",
                        "“जैसे नींबूपानी में नींबू ज़रूरी है , वैसे ही दोस्ती में बेइज्जती भी ज़रूरी है ”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"No Data Found"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        } else if(title.equals("Friendship")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“Friendship is born at that moment when one person says to another: ‘What! You too? I thought I was the only one.”"
                        , "“The only way to have a friend is to be one.”"
                        , "“There’s not a word yet for old friends who’ve just met.”"
                        , "“One measure of friendship consists not in the number of things friends can discuss, but in the number of things they need no longer mention.”"
                        , "“Friendship is delicate as a glass, once broken it can be fixed but there will always be cracks.”"
                        , "“When you stop expecting people to be perfect, you can like them for who they are.”"
                        , "“A good word is an easy obligation; but not to speak ill requires only our silence; which costs us nothing.”"
                        , "“Be slow to fall into friendship; but when thou art in, continue firm & constant.”"
                        , "“Sweet is the memory of distant friends! Like the mellow rays of the departing sun, it falls tenderly, yet sadly, on the heart.”"
                        , "“A friend is a person with whom I may be sincere. Before him I may think aloud. I am arrived at last in the presence of a man so real and equal, that I may drop even those undermost garments of dissimulation, courtesy, and second thought, which men never put off, and may deal with him with the simplicity and wholeness with which one chemical atom meets another.”"
                        , "“No friendship is an accident.”"
                        , "“Be slow to fall into friendship, but when you are in, continue firm and constant.”"
                        , "“A single rose can be my garden… a single friend, my world.”"
                        , "“Never idealize others. They will never live up to your expectations. Don’t over-analyze your relationships. Stop playing games. A growing relationship can only be nurtured by genuineness. “"};

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“हम बाकी सभी रिश्तों के साथ पैदा होते हैं पर दोस्ती ही एक मात्र रिश्ता है जिसे हम खुद बनाते हैं.”",
                        "“मित्र वो होता है जो आपको जाने और आपको उसी रूप में चाहे.”",
                        "“व्यवसाय पर आधारित दोस्ती, दोस्ती पे आधारित व्यवसाय से बेहतर है.”",
                        "“एक सच्चा दोस्त कभी आपके रास्ते में नहीं आता जब तक कि आप गलत रास्ते पे ना जा रहे हों.”",
                        "“किसी जंगली जानवर की अपेक्षा एक कपटी और दुष्ट मित्र से ज्यादा डरना चाहिए, जानवर तो बस आपके शरीर को नुकसान पहुंचा सकता है, पर एक बुरा मित्र आपकी बुद्धि को चोटिल कर सकता है.”",
                        "“सभी के साथ विनम्र रहिये, पर कुछ के साथ ही घनिष्ठता बनाइये, और इन कुछ को भी पूर्ण विश्वास करने से पहले अच्छी तरह से जांच लीजिये.”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"“આ જગત માં એવા દોસ્તો પણ આવી જાય છે,\n" +
                        "કે જે વચન નથી આપતા પણ નીભાવી જાય છે. ”",
                        "“ગુસ્સે થયા જો લોકો તો પત્થર સુધી ગયા, પણ દોસ્તો ના હાથ તો ખંજર સુધી ગયા,\n" +
                                "દોસ્ત અમારે તો નિભાવવી હતી દોસ્તી, ને એટલે તો દુશ્મનો ના ઘર સુધી ગયા.....”",
                        "“જીવન માં એક મિત્ર કૃષ્ણ જેવો હોવો જોઈએ જે તમારા માટે યુદ્ધ ન લડે પણ સાચું માર્ગદર્શન તો જરૂર આપે.”",
                        "“ફૂલ પણ ખીલી ઉઠે છે જોઇને તારી મિત્રતા, જીંદગી જીવવા માટે ઓછી લાગે છે જોઇને તારી મિત્રતા....”",
                        "“તારી મૈત્રી માં કઈ સર લાગે છે, કોઈ પોતાનું હોય એવો અણસાર લાગે છે,\n" +
                                "જીંદગી ની કડવાશ માં થઇ એક મિત્રતા મધુર, બાકી તો આવી મિત્રતા થવામાં પણ વાર લાગે છે....”",
                        "“\n" +
                                "    આ દુનિયા માં બધું જ મળે છે, પણ મળતી નથી દોસ્તી,\n" +
                                "    દોસ્તી નું નામ જીંદગી, અને જીંદગી નું નામ દોસ્તી.....\n" +
                                "\n”",
                        "“જે માણસ એક સાચો મિત્ર નથી બની સકતો , એ ભલે સફળ હોય પણ એનું જીવન નિષ્ફળ જ છે....”"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        } else if(title.equals("GoodMorning")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“Good Morning! I hope your day is as positive as you are.”"
                        , "“Happy thoughts are the only cure for a sleepy morning… and I feel the happiest when I think about you!”"
                        , "“Nothing is impossible when you put your mind, heart, soul and sweat into it. Have a great morning.”"
                        , "“Sending love and smiles your way for a happy happy day.”"
                        , "“Every day is a new day, new hope and new opportunity. Good morning!”"
                        , "“You are a blessing to my mornings.”"
                        , "“There are so many reasons to be thankful every day. I am thankful for you.”"
                        , "“Sharing smiles with the one you love is the perfect way to start the day.”"
                        , "“Morning is the start of every day and I will live each day like it’s a new day, renewing our love.”"
                        , "“The best feeling in the world is to know that you are mine and I am yours. Every morning that is enough for me to have a good day.”"
                        , "“I hope your morning is as bright and gorgeous as your smile.”"
                        , "“With you my mornings have never been better. I am always on cloud nine.”"
                        , "“The sun is up, the skies are blue, good morning my love I’ll be thinking about you.”"
                };

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={
                        "“हो सकता है हर दिन अच्छा ना हो, लेकिन हर दिने में कुछ न कुछ अच्छा होता है।”",
                        "“हर सुबह तेरी मुस्कुराती रहे, हर शाम तेरी गुनगुनाती रहे। मेरी दुआ है कि तू जिसे भी मिले, हर मिलने वाले को तेरी याद सताती रहे।”",
                        "“हर सुबह आपको सतना प्यार लगता है, सोये हुए को नींद से जगाना अच्छा लगता है, जब भी किसी की याद आती है……. तो उसको भी अपनी याद दिलाना अच्छा लगता है।”",
                        "“जिंदगी कितनी खूबसूरत है ये देखने के लिए हमें ज्यादा दूर जाने की जरूरत नहीं है, जहाँ हम अपनी आंखें खोल ले वहीं हम इसे देख सकते हैं।”",
                        "“सुबह की हर धूप कुछ याद दिलाती है, हर महकती खुशबू एक जादू जगाती है, कितनी भी व्यस्त क्यों ना हो यह ज़िन्दगी, सुबह सुबह अपनों की याद आ ही जाती है।”",
                        "“हर जलते दीपक तले अंधेरा होता है, हर रात के बाद एक सवेरा होता है, मुसीबत देख कर डर जाते है लोग, लेकिन हर मुसीबत के पीछे सच का सवेरा होता है।”",
                        "“रात सुबह का इंतज़ार नहीं करती, खुशबू मौसम का इंतज़ार नहीं करती, जो भी खुशी मिले उसका आनद लिया करो, क्योंकि ज़िन्दगी वक्त का इंतज़ार नही करती।।”",
                        "“सवेरे सवेरे हो खुशियों का मेला, ना लोगो की परवाह ,ना दुनियाँ का झमेला, पक्षियों का संगीत हो और मौसम अलबेला मुबारक हो आपको ये खूबसूरत सवेरा।”",
                        "“दीपक बोलता नही उसका प्रकाश परिचय देता है, ठीक उसी प्रकार आप अपने बारें में कुछ ना बोले बस अच्छे कर्म करते रहिए, वहीं आपका परिचय देंगे।”",
                        "“प्रेम वो चीज है……..जो इंसान को कभी मुरझाने नहीं देता, और नफ़रत वो चीज़ है, जो इंसान को कभी खिलने नहीं देता।”",
                        "“वादा किया हैं तो निभाएंगे, सूरज की किरणें बनकर तेरी छत पर आएंगे हम है तो जुदाई का गम कैसा, तेरी हर सुबह को फूलों से सजायेंगे।”",
                        "“उदासियों की वज़ह तो बहुत है ज़िन्दगीं में, लेकिन बिना वज़ह के ख़ुश रहने का मज़ा ही कुछ और है, इसलिए हमेशा खुश रहो।”",
                        "“सूरज निकलने का वक्त हो गया है, फूल खिलने का वक्त हो गया है, मीठी नींद से जागो मेरे दोस्त, क्योंकि  सपनों को हक़ीक़त में बदलने का वक्त हो गया है।”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"“જરુરિયાત મુજબ જિંદગી જીવો,\n" +
                        "શોખ મુજબ નહી,\n" +
                        "કારણ કે જરુરિયાત ગરીબ ની પણ પુરી થાય છે,\n" +
                        "અને શોખ રાજા ના પણ અધૂરા રહી જાય છે.”",
                        "“જવાબદારી નામની મજબુરી નડે છે સાહેબ…\n" +
                                "નહીંતર\n" +
                                "દુનિયા નો કોઈ બાપ પોતાની ઢીંગલી ને પારકાં ઘરે વિદાય ના કરે….\n" +
                                "“?જય શ્રી કૃષ્ણ…?\n" +
                                "? સુપ્રભાત?”",
                        "“આપણુ કોઇ જ કામ ન હોવા\n" +
                                "છતાં સંપર્ક રાખવાનું મન થાય\n" +
                                "તેને જ ” સબંધ ” કહેવાય. ??શુભ સવાર ?”",
                        "“જે લોકોએ આપણને સંઘર્ષ કરતા જોયા હોય એમને આપણી સફળતાની સાચી કિંમત હોય,બાકીના લોકો આપણે નસીબદાર છીએ એવું જ સમજે છે.???? શુભ સવાર ????”",
                        "“માં એ નાનપણ માં\n" +
                                "એક વાત કહી હતી,\n" +
                                "સામેવાળો સુખી હોય\n" +
                                "તો આમંત્રણ વગર જાવું નહીં\n" +
                                "અને દુ:ખી હોય તો નિમંત્રણ\n" +
                                "ની વાટ જોવી નહી…✍?।? શુભ સવાર ?”",
                        "“જીવન માં બની શકે તો….\n" +
                                "માગણી કરતા લાગણી ને વધારે માન આપજો….\n" +
                                "કેમ કે,\n" +
                                "સંબંધો ને હંમેશા સાચવવાના હોય છે….\n" +
                                "સાહેબ…. વાપરવા ના નહીં….!\n" +
                                "શુભ સવાર”",
                       };
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        } else if(title.equals("Smile")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“Peace begins with a smile.”"
                        , "“Smiling is definitely one of the best beauty remedies. If you have a good sense of humor and a good approach to life, that’s beautiful.”"
                        , "“Smile, smile, smile at your mind as often as possible. Your smiling will considerably reduce your mind’s tearing tension.”"
                        , "“Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy.”"
                        , "“I eat every two hours. I sleep for eight hours. I have lots of water. I pray to keep calm. Most importantly, I have a smile on my face.”"
                        , "“Smile, it’s free therapy.”"
                        , "“Use your smile to change the world; don’t let the world change your smile.”"
                        , "“Smile, it’s free therapy.”"
                        , "“Lighten up, just enjoy life, smile more, laugh more, and don’t get so worked up about things.”"
                        , "“The real man smiles in trouble, gathers strength from distress, and grows brave by reflection.”"
                        , "“Smile at strangers and you just might change a life.”"
                        , "“Always find opportunities to make someone smile, and to offer random acts of kindness in everyday life.”"
                        , "“If you have only one smile in you, give it to the people you love.”"};


                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“हमेशा खुश रहो,आपके होंठो की हसी हमें जिन्दा रहने की वजह देती है.”",
                        "“जिन्दगी मे सबसे बडा घनवान इंसान वो होता हे, जो दुसारो को अपनी SMILE देकार, उसका दिल जीत लेता हे, बस हर पल हँसते रहो.”",
                        "“मुस्कुराना एक ऐसा उपहार है जो बिना मोल के भी अनमोल है, इसमें देने वाले का कुछ कम नहीं होता, और पाने वाला निहाल हो जाता है!”",
                        "“जरा मुस्कुरा के देखो,दुनिया हँसती नजर आएगी!”",
                        "“तुम्हारी मुस्कान से ही शुरू हुई हमारी कहानी…. मुस्कराते रहना यही आखरी तमन्ना है हमारी….”",
                        "“क़ुर्बान हो जाऊं मुस्कराहट पे तुम्हारे, या इसे देखकर जीने का एक बहाना ढूंढ लूं…”",
                        "“चलो मुस्कुराने की वजह ढुंढते हैं, तुम हमें ढुंढो.. हम तुम्हे ढुंढते हैं..!”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"No Data Found"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        }else if(title.equals("Success")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.”"
                        , "“Patience, persistence and perspiration make an unbeatable combination for success.”"
                        , "“Self-belief and hard work will always earn you success.”"
                        , "“Seventy percent of success in life is showing up.”"
                        , "“Failure is not an option. Everyone has to succeed.”"
                        , "“The only place success comes before work is in the dictionary.”"
                        , "“Success is not the absence of failure; it’s the persistence through failure.”"
                        , "“Success is achieved and maintained by those who try and keep trying.”"
                        , "“Success consists of getting up just one more time than you fall.”"
                        , "“Willpower is the key to success. Successful people strive no matter what they feel by applying their will to overcome apathy, doubt or fear.”"
                        , "“Belief in oneself is one of the most important bricks in building any successful venture.”"
                        , "“Success requires first expending ten units of effort to produce one unit of results. Your momentum will then produce ten units of results with each unit of effort.”"
                        , "“It takes 20 years to make an overnight success.”"
                        , "“There are people who make things happen, there are people who watch things happen, and there are people who wonder what happened. To be successful, you need to be a person who makes things happen.”"};

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“जब तक आप अपनी समस्याओं एंव कठिनाइयों की वजह दूसरों को मानते है, तब तक आप अपनी समस्याओं एंव कठिनाइयों को मिटा नहीं सकते|”",
                        "“भीड़ हमेशा उस रास्ते पर चलती है जो रास्ता आसान लगता है, लेकिन इसका मतलब यह नहीं की भीड़ हमेशा सही रास्ते पर चलती है| अपने रास्ते खुद चुनिए क्योंकि आपको आपसे बेहतर और कोई नहीं जानता|”",
                        "“इस दुनिया में असंभव कुछ भी नहीं| हम वो सब कर सकते है, जो हम सोच सकते है और हम वो सब सोच सकते है, जो आज तक हमने नहीं सोचा|”",
                        "“बीच रास्ते से लौटने का कोई फायदा नहीं क्योंकि लौटने पर आपको उतनी ही दूरी तय करनी पड़ेगी जितनी दूरी तय करने पर आप लक्ष्य तक पहुँच सकते है|”",
                        "“सफलता हमारा परिचय दुनिया को करवाती है और असफलता हमें दुनिया का परिचय करवाती है|”",
                        "“अगर किसी चीज़ को दिल से चाहो तो पूरी कायनात उसे तुमसे मिलाने में लग जाती है”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"“*સંન્યાસી ના ખાનગી સંસાર કરતા*\n" +
                        "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF39\n" +
                        "*સંસારી નો ખાનગી સંન્યાસ વધુ મૂલ્યવાન છે..*\n" +
                        "\uD83D\uDE0C\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE0C\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE0C”",
                        "““ મારી પાસે એક સફરજન હોય ,\n" +
                                "તમારી પાસે એક સફરજન હોય,\n" +
                                "           અને\n" +
                                "આપણે એક બીજાને આપીએ,\n" +
                                "તો બન્ને પાસે એક એક સફરજન રહે છે.\n" +
                                "           પરંતુ જો,\n" +
                                "મારી પાસે એક વિચાર હોય,\n" +
                                "અને તમારી પાસે પણ એક વિચાર હોય\n" +
                                "    અને જો આપણે,\n" +
                                "તે એક બીજા ને આપીએ , તો \n" +
                                "    બંને પાસે બે વિચાર રહે છે ! \n" +
                                "                      -જયોજઁ બનાઁડઁ શો.”",
                        "“મુશ્કિલ પરિસ્થિતિઓમાં સંઘર્ષ કરતી વખતે, એક બહુમૂલ્ય સંપત્તિ વિકસિત થાય છે..\n" +
                                "\n" +
                                " જેનું નામ છે આત્મબળ..!\n" +
                                "\n" +
                                "*શુભ સવાર..!*”",
                        "“જ્યાં સુધી *તમે ખુદ મેદાન છોડીને ના જાવ*,\n" +
                                "\n" +
                                "ત્યાં સુધી *તમને કોઈ હરાવી ન શકે*.... !!”",
                        "“*માણસ* હંમેશા એ *વિચારે છે* કે *ભગવાન છે કે નહિ*....???\n" +
                                "\n" +
                                "પણ, એ *કોઇ દિવસ નથી વિચારતો* કે *પોતે માણસ છે કે નહિ*....???”"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        }else if(title.equals("Angry")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“A hand ready to hit, may cause you great trouble.”"
                        , "“A man in a passion, rides a mad horse.”"
                        , "“A quarrelsome man has no good neighbours.”"
                        , "“Anger is a short madness.”"
                        , "“Anger is often more hurtful than the injury that caused it.”"
                        , "“Anger is one letter short of danger.”"
                        , "“Clouds gather before a storm.”"
                        , "“Don't get your back up.”"
                        , "“Exaggeration is truth that has lost its temper.”"
                        , "“Fire in the heart sends smoke into the head.”"
                        , "“Hard words break no bones.”"
                        , "“If you are patient in one moment of anger, you will escape a hundred days of sorrow.”"
                        , "“If you kick a stone in anger you will hurt your foot.”"
                        , "“Postpone today's anger until tomorrow.”"
                        , "“The anger of the prudent never shows.”"
                        , "“The greatest remedy for anger is delay.”"};

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={"“माचिस किसी दूसरी चीज को जलाने से पहले खुद को जलाती है, इसी तरह गुस्\u200Dसा पहले आपको बर्बाद करता है फिर दूसरे को!!”",
                        "“क्रोध का भाव हमेशा क्रोधी को ज्\u200Dयादा नुकसान पहुँचाता है बजाय उसके जिस पर वो क्रोधित हो रहा है”",
                        "“क्रोध आने पर चिल्लाने के लिये ताकत नहीं चाहिए मगर क्रोध आने पर चुप रहने के लिए बहुत ताकत चाहिए!”",
                        "“गुस्से में बोला गया एक कठोर शब्द इतना जहरीला बन सकता है, कि आपकी हजार प्यारी बातों को एक मिनट में नष्ट कर सकता है!”",
                        "“माचिस किसी दूसरी चीज को जलाने से पहले खुद को जलाती हैं.. गुस्सा भी एक माचिस की तरह है.. यह दुसरो को बरबाद करने से पहले खुद को बरबाद करता है!!!”",
                        "“गुस्सा बहुत ही चतुर होता है हमेशा कमजोर पर ही निकलता!!”",
                        "“यदि आप सही है तो… आपको गुस्सा होने की जरूरत नहीं…!! और यदि आप गलत है तो… आपको गुस्सा होने का कोई हक नहीं…!!”",
                        "“क्रोध एक प्रचंड अग्नि है, जो मनुष्य इस अग्नि को वश में कर सकता है वह उसे बुझा देगा, जो मनुष्य अग्नि को वश में नहीं कर सकता वह स्ंवय अपने को जला लेगा!!”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"No Data Found"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        }else if(title.equals("Sad")){

            t1.setTitleTextColor(getColor(R.color.white));
            t1.setTitle(title);
            if(lang.equals("E N G L I S H")) {
                String qut_item[] = {"“The moral of the story is that no matter how much we try, no matter how much we want it some stories don't have a happy ending.”"
                        , "“The moral of the story is that no matter how much we try, no matter how much we want it some stories don't have a happy ending.”"
                        , "“I did not die, and yet I lost life’s breath.”"
                        , "“I am on your side. But you have no way of knowing it, because your heart is blind.”"
                        , "“You don’t forget the face of the person who was your last hope.”"
                        , "“People always leave. Don't get too attached.”"
                        , "“If you expect nothing from anybody, you’re never disappointed.”"
                        , "“Dreams don't mean anything. They're just noise. They're not real.”"
                        , "“I can hardly speak, and when I try it's nothing but a squeak.”"
                        , "“I pretend I’m not hurt, I walk about the world like I’m having fun.”"
                        , "“On the shore of the wide world I stand alone.”"
                        , "“We had nothing to lose and lost it anyway.”"
                        , "“It hurts every day, the absence of someone who was once there.”"
                        , "“I don’t even remember why I’m wasting all these tears on you.”"
                        , "“You meet everyone twice in this life, when they come and when they go.”"
                        , "“With all the smiles you brought me I never thought that you could cause me so many tears.”"
                        , "“Trauma lives in the sea of my body, awash in the waters of forgetting.”"
                        , "“I understand that nobody understands me, but I can’t be someone I’m not.”"
                        , "“I am crazy sad, and somewhere deep inside, all I want is to fly.”"};

                item = qut_item;
            }
            else if(lang.equals("H I N D I")){
                String qut_item[]={
                        "“मुझे जिंदगी का तजूर्बा तो नहीं पर इतना मालूम है,\n" +
                                " \n" +
                                " छोटा इंसान बडे मौके पर काम आ सकता है।”",
                        "“मंजिल चाहे कितनी भी उंची क्यो नाहोदोस्तो..!!\n" +
                                " \n" +
                                " रास्ते हमेशा पेरो के नीचे होते हे.”",
                        "“ यहाँ सब समझते है के मैं इश्क़ का माराहूँ,हाँ अन्जान हैं,\n" +
                                " \n" +
                                " के उन्होंने अभी मेरामेहबूब नहीं देखा.”",
                        "“रोता वही है जिसने महसूस कि हो सच्चीमोहब्बत को,\n" +
                                " \n" +
                                " वरना मतलब के रिश्तें रखने वाले को तो कोईभी नही रूला सकता.”",
                        "“ जरुरत है कुछ नए नफरत करने वालो की पुराने वाले चाहने लगे है मुझे.”",
                        "“सुना है तुम्हे मोहोबत का सोक नहीं है लेकिन बर्बाद तो तुम कमाल का करती हो.”",
                        "“जिंदगी खर्च कर दी तुझे पाने की चाहत मे ।\n" +
                                " \n" +
                                " इससे बडी कीमत क्या होती तेरे प्यार की ।।”",
                        "“ ना तुमने आवाज़ दी ना मैंने मुड़ के देखाख़ामोशी चलती रही दरम्यां !!”"};
                item=qut_item;
            }
            else
            {
                String qut_item[]={"No Data Found"};
                item=qut_item;
            }
            r1 = (RecyclerView) findViewById(R.id.view_quotes_rec);
            r1.setLayoutManager(new GridLayoutManager(ViewQuotes.this, 1));
            r1.setAdapter(new CustomQutesAdapter(getApplicationContext(), item));

        }
    }
}
