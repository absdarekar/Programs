#!/bin/sh

# Shell script to install required softwares and libraries for development of OctoCAD
# author: Atharv Darekar

# Enables universe repository and download package information from all configured sources

echo "Enable universe repository and update package information"
sudo add-apt-repository universe && sudo apt-get update

# installs pip3

echo "Installing pip3"
sudo apt install python3-pip -y

# install PyQt5 developer and PyQt5 developer tools

echo "Installing PyQt5 developer"
sudo apt install pyqt5-dev
echo "Installing PyQt5 developer tools"
sudo apt install pyqt5-dev-tools

# installs PyQt5 and pyqt5-tools

echo "Installing PyQt5 and PyQt5 tools"
pip3 install PyQt5 && pip3 install pyqt5-tools

# installs Git

echo "Installing Git"
sudo apt-get install git-core git-gui git-doc -y

# installs FreeCAD

echo "Installing FreeCAD"
sudo apt install freecad -y

# install Qt 5 Designer
echo "Installing Qt 5 Designer"
sudo apt install qtcreator -y

# installs Atom

echo "Installing Atom"
wget -O atom-amd64.deb "https://atom.io/download/deb"
sudo dpkg --install  atom-amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# installs Discord

echo "Installing Discord"
wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# removes downloaded .deb files

rm atom-amd64.deb && rm discord.deb
