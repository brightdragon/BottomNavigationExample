# BottomNavigationExample

Android BottomNavigation Fragment
---------------------------------

build.gragle 
add 
- 'androidx.navigation:navigation-runtime-ktx:version'
- 'androidx.navigation:navigation-fragment-ktx:version'
- 'androidx.navigation:navigation-ui-ktx:version'


res  
>add
>>Android Resource Directory -> navigation

layout  
add -> fragment layout  
exmplae) fragment_first.xml, fragment_second.xml, fragment_third.xml  
  
navigation
add -> navigations xml file  
example)  
first.xml, second.xml, third.xml
add  
  <navigation  
    ...  
    app:startDestination="@id/screen_id" />  
      
  <fragment  
    android:id=  
    android:name=  
    android:label=  
   >  
   </fragment>  
