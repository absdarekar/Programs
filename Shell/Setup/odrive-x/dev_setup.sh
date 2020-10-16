#!/bin/sh

# Shell script to install required softwares and libraries for development of odrive-x
# author: Atharv Darekar

# Enables Universe repository, updates and upgrades the system

sudo add-apt-repository universe && sudo apt-get update && sudo apt-get upgrade -y

# installs pip3

sudo apt install python3-pip -y

# installs PyQt5, PyQtWebEngine and pyqt5-tools

pip3 install PyQt5 && pip3 install PyQtWebEngine && pip3 install pyqt5-tools

# installs Git

sudo apt-get install git-core git-gui git-doc -y

# install Qt 5 Designer

sudo apt install qtcreator -y

# installs Discord

wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# removes downloaded .deb files

rm discord.deb
