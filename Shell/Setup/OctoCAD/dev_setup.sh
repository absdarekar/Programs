#!/bin/sh

# Shell script to install required softwares and libraries for development of OctoCAD
# author: Atharv Darekar

# Enables Universe repository, updates and upgrades the system

sudo add-apt-repository universe && sudo apt-get update && sudo apt-get upgrade -y

# installs pip3

sudo apt install python3-pip -y

## installs PyQt5 and pyqt5-tools

pip3 install PyQt5 && pip3 install pyqt5-tools

# installs Git

sudo apt-get install git-core git-gui git-doc -y

# installs GNU Octave and octave-symbolic package

sudo apt install octave -y
sudo apt-get install octave-symbolic -y

# installs FreeCAD

sudo add-apt-repository ppa:freecad-maintainers/freecad-stable -y && sudo apt-get update
sudo apt install freecad -y

# install TeXstudio

sudo apt-get install texstudio -y

# install Qt 5 Designer

sudo apt install qtcreator -y

# installs Atom

wget -O atom-amd64.deb "https://atom.io/download/deb"
sudo dpkg --install  atom-amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# installs Discord

wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# installs Cryptomator

sudo add-apt-repository ppa:sebastian-stenzel/cryptomator && sudo apt-get update -y
sudo apt-get install cryptomator

# removes downloaded .deb files

rm atom-amd64.deb && rm discord.deb
