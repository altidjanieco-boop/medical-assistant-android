# Medical Assistant Android App 🏥

تطبيق مساعد طبي احترافي لنظام Android، يوفر خدمات استشارة طبية وحجز المواعيد والمزيد.

## المميزات ✨

- 👨‍⚕️ **استشارات طبية** - تواصل مع أطباء متخصصين
- 📅 **حجز المواعيد** - احجز موعدك بسهولة
- 📋 **السجلات الطبية** - احفظ وتابع سجلاتك
- 💊 **الوصفات الطبية** - تابع أدويتك
- 🎨 **تصميم عصري** - واجهة مستخدم جميلة مع Material Design 3
- 🌙 **دعم الوضع الليلي** - راحة العين في جميع الأوقات

## المتطلبات 📋

- Android 7.0+ (API Level 24)
- Android Studio Giraffe أو أحدث
- Java Development Kit (JDK) 17+
- Gradle 8.0+

## البناء والتثبيت 🔧

### 1. استنساخ المستودع
```bash
git clone https://github.com/altidjanieco-boop/medical-assistant-android.git
cd medical-assistant-android
```

### 2. فتح المشروع
- افتح Android Studio
- اختر "Open an existing project"
- اختر مجلد المشروع

### 3. البناء
```bash
./gradlew build
```

### 4. التثبيت على جهاز أو محاكي
```bash
./gradlew installDebug
```

### 5. إنشاء APK للإصدار
```bash
./gradlew assembleRelease
```

سيتم إنشاء ملف APK في: `app/build/outputs/apk/release/app-release.apk`

## بنية المشروع 📁

```
medical-assistant-android/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/medical/assistant/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── screens/
│   │   │   │   │   └── theme/
│   │   │   │   ├── data/
│   │   │   │   └── viewmodel/
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## المكتبات المستخدمة 📚

- **Jetpack Compose** - واجهة مستخدم حديثة
- **Room Database** - قاعدة بيانات محلية
- **Hilt** - حقن التبعيات
- **Retrofit** - طلبات API
- **ViewModel & LiveData** - إدارة البيانات
- **Navigation Compose** - التنقل بين الشاشات
- **Coil** - تحميل الصور

## التطوير المستقبلي 🚀

- [ ] تكامل API الخادم
- [ ] نظام المصادقة والدخول
- [ ] تطبيق نظام الدفع
- [ ] إشعارات فورية
- [ ] المزيد من الميزات الطبية

## المساهمة 🤝

نرحب بمساهماتك! يرجى:

1. قم بـ Fork المشروع
2. أنشئ فرع للميزة الجديدة (`git checkout -b feature/AmazingFeature`)
3. قم بـ Commit التغييرات (`git commit -m 'Add some AmazingFeature'`)
4. اضغط على الفرع (`git push origin feature/AmazingFeature`)
5. افتح Pull Request

## الترخيص 📜

هذا المشروع مرخص تحت MIT License - اطلع على ملف LICENSE للتفاصيل.

## التواصل 📞

للأسئلة والاقتراحات، يرجى فتح Issue على GitHub.

---

**تم الإنشاء بـ ❤️ بواسطة Medical Assistant Team**
