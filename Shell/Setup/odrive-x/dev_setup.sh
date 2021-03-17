#!/bin/sh

# Shell script to install required softwares and libraries for development of odrive-x
# author: Atharv Darekar

# Enables universe repository and download package information from all configured sources

echo "Enable universe repository and update package information"
sudo add-apt-repository universe && sudo apt-get update

# installs pip3

echo "Installing pip3"
sudo apt install python3-pip -y

# installs PyQt5, PyQtWebEngine and pyqt5-tools

echo "Installing PyQt5, PyQtWebEngine and PyQt5 tools"
pip3 install PyQt5 && pip3 install PyQtWebEngine && pip3 install pyqt5-tools

# install Qt 5 Designer

echo "Installing Qt 5 Designer"
sudo apt install qtcreator -y

# installs Git

echo "Installing Git"
sudo apt-get install git-core git-gui git-doc -y

# installs Discord

echo "Installing Discord"
wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# removes downloaded .deb files

rm discord.deb
