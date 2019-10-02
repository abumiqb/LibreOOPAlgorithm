# LibreOOPAlgorithm


## How to build for us sensors (and maybe even Germany and other countries).
Currently only the version below of xDrip works with the new OOP, using mm2 and manual scanning.
Once I'll know that this works, It will be published as official xdrip release.

### building the apk
git clone https://github.com/tzachi-dar/LibreOOPAlgorithm.git<br/>
cd LibreOOPAlgorithm<br/>
git checkout libre-us-new-sensor<br/>
scripts\create_apk.cmd<br/>

Install the apk: adb install -r LibreOOPAlgorithm.apk<br/>
Open the apk, and make sure that you see the message "Algorithm worked correctly".<br/>

### Burn the new fw on your miaomiao2 device (only miaomiao2 right now)
1) Download the new fw to your android phone from here: https://drive.google.com/uc?id=1ocJfF4sHZCaBqo-Qs1IuiUAXqf2efQLO&export=download  
1) Download the application "nRF connect for Mobile (Norodic semicondutuctor ASA)" from the playstore.  
1) Open the nrf connect application.  
1) Press scan.  
1) press connect on the miaomiao2_xxxx device.  
1) Press on "Unknown Service".  
1) Press on the "up arrow".  
1) A message box will say: Write value, Do you want to reset the device to bootloader? -> press send.  
1) A new device will be created with the name: miaomiao2A_XXXX - please see the capital letters used to identify this device.  
1) For the last steps, please see the following movie: https://drive.google.com/uc?id=1nfP8dWLcfN3pUofqHE0xLUNWEHdtzfZp&export=download  
1) Connect to the new device.  
1) Press on DFU (see movie).  
1) A dialog saying "Select file type" will be opened. Select "Distrebuation packet (ZIP) and press OK.  
1) Choose the fw file that you have downloaded on the first step.  
1) The new fw will be burned to the miaomiao. Wait till you get to 100%.  
1) For the last steps, please see the following movie: https://drive.google.com/uc?id=1JQmJm6VKtwG38QkZoFq4awdJ1EQ-xmFq&export=download  
1) Verify that fw version is now 7. See the following image: https://drive.google.com/uc?id=1kRPXooaV5pEEKqMq5d9zzg_OMIKQ_tc8&export=download (you can also verify that fw version is 7 on xDrip. Go to
status, slide right to Bluetooth status and look at fw version).  


### Download and install xdrip on your phone
(if you already have xdrip on your phone, you will have to remove it first. You can backup your DB and settings first).  
1) You must use the version from here: https://drive.google.com/uc?id=18PM5HJr00GmQ1DafxGdevzTBsYfBCv73&export=download  
1) Choose libre as the sensor type.  
1) Choose miaomiao.  
1) Start a new sensor (answer not today).  
1) Go to settings->less common settings->other misc options-> and set "use oop algorithm"  
1) (optional) Go to nfc scan features-> enable scanning  

In a few minutes you should get the libre readings.  
Hopefully all will work. Let me know in any case.  






## Normal oop 




This is an apk that allows translating libre sensor readings to blood glucose.
It has been able to get results extremely close to the libre reader without any calibrations.
Should be used with xDrip-plus.

## TLDR: To create the apk, please do the following (on a windows pc):

Make sure that your pc has android studio instaled. follow the movie at https://developer.android.com/studio/install.html for instructions on how to install android studio. <br/>

Creating the apk using chrome:

1) You are now on the page: https://github.com/tzachi-dar/LibreOOPAlgorithm.
2) Press clone or download. Then Download zip.
3) On the downloaded file, right click "show in folder".
4) right click "Extract all ...". Press extract.
5) A new windows will be opened, double click LibreOOPAlgorithm-master
6) double click windows_create_apk.cmd (If windows will ask for permission to run the file, please allow it).
After a few seconds the file LibreOOPAlgorithm.apk will be in the directory.
Send it by mail to the phone and install it.

Here is a short youtube video showing what you should do: https://www.youtube.com/watch?v=PfLHT9pI058&
(If this is taking more then 60 seconds, you need to practice.)

On your phone, Open the apk. If you see a message saying "The algorithm worked successfully" all is done. If you see an error message please let me know. <br/>

from command line (advanced) run

The apk that you need to install is LibreOOPAlgorithm.apk
Before doing it, please go to settings->security and turn on "unknown sources"

You can install the apk in anyway you like, for example: adb install LibreOOPAlgorithm.apk
git clone https://github.com/tzachi-dar/LibreOOPAlgorithm.git<br/>
cd LibreOOPAlgorithm<br/>
scripts\create_apk.cmd<br/>


You can also send it by mail (or copy) it to your phone and install it from there.<br/>


# If you are using Mac or linux, please do the following:
Download and install java jdk first to make sure the "jarsigner" command is available !


git clone https://github.com/tzachi-dar/LibreOOPAlgorithm.git

cd LibreOOPAlgorithm

./scripts/download_apk.sh

./scripts/create_apk.sh

## Setting xDrip to work with the oop Algorithm.

Currently Tomato (MiaoMiao), BluCon, LibreAlarm and direct scanning supports the Libre OOP Algorithm. <br/>

xDrip has to be at a version after  21st may 2018 nightly. (This probably means that you have to download the latest nightly).

On xdrip go to setting->less common settings->other misc options-> and set out of process blukon algorithm. 
(If this option is disabled, this means that your version of xDrip is too old).

## The propose of this project is to allow opensource projects to use the same algorithm for bg calculation.
This is a specific example that simulates official results, but anyone can implement whatever algorithm that he wants.

Please see the class IntentsReceiver for how to send and receive intents with raw data from the libre sensor.
