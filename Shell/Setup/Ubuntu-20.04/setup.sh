#!/bin/sh

# Shell script to setup Atharv Darekar's Ubuntu 20.04 LTS Environment
# author: Atharv Darekar

# Enable Universe repository and update the system

echo "1 of 29"
sudo add-apt-repository universe && sudo apt-get update

# install curl

echo "2 of 29"
echo "Installing curl"
sudo apt install curl -y

# install Cryptomator

echo "3 of 29"
echo "Installing Cryptomator"
sudo add-apt-repository ppa:sebastian-stenzel/cryptomator -y && sudo apt-get update -y
sudo apt-get install cryptomator -y

# install odrive Sync Agent

echo "4 of 29"
echo "Downloading odrive Sync Agent"
path="$HOME/.local/bin" && curl -L "https://dl.odrive.com/odrive-py" --create-dirs -o "$path/odrive.py" && curl -L "https://dl.odrive.com/odriveagent-lnx-64" | tar -xvzf- -C "$path/" && curl -L "https://dl.odrive.com/odrivecli-lnx-64" | tar -xvzf- -C "$path/"
chmod +x $HOME/.local/bin/*

# install Rclone

echo "5 of 29"
echo "Installing Rclone"
wget "https://downloads.rclone.org/rclone-current-linux-amd64.deb"
sudo dpkg --install rclone-current-linux-amd64.deb

# install dconf-editor

echo "6 of 29"
echo "Installing dconf-editor"
sudo apt-get install dconf-editor -y

# install mkusb

echo "7 of 29"
echo "Installing mkusb"
sudo add-apt-repository ppa:mkusb/ppa -y && sudo apt-get update -y
sudo apt-get install mkusb usb-pack-efi -y

# install pip3

echo "8 of 29"
echo "Installing pip3"
sudo apt install python3-pip -y

# install PyQt5, PyQtWebEngine and pyqt5-tools

echo "9 of 29"
echo "Installing PyQt5, PyQt5-Tools and PyQtWebEngine"
pip3 install PyQt5 && pip3 install pyqt5-tools && pip3 install PyQtWebEngine

# install Qt 5 Designer

echo "10 of 29"
echo "Installing Qt Creator"
sudo apt install qtcreator -y

# install GNU Octave and octave-symbolic package

echo "11 of 29"
echo "Installing GNU Octave"
sudo apt install octave -y
echo "Installing octave-symbolic package"
sudo apt-get install octave-symbolic -y

# installs FreeCAD

echo "12 of 29"
echo "Installing FreeCAD"
sudo apt install freecad -y

# install Java Development Kit

echo "13 of 29"
echo "Installing Java Development Kit"
sudo apt install default-jdk -y

# install Atom

echo "14 of 29"
echo "Installing Atom"
wget -O atom-amd64.deb "https://atom.io/download/deb"
sudo dpkg --install  atom-amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install Git

echo "15 of 29"
echo "Installing Git"
sudo apt-get install git-core git-gui git-doc -y

# setup Git

echo "16 of 29"
echo "Setting up Git"
git config --global user.name "absdarekar"
git config --global user.email "absdarekar01@gmail.com"
mkdir $HOME/GitHub
cd $HOME/GitHub
echo "Cloning repositories"
git clone https://github.com/absdarekar/numerical-analysis.git
git clone https://github.com/absdarekar/finite-element-analysis.git
git clone https://github.com/absdarekar/odriveCLI.git
git clone https://github.com/absdarekar/Training.git
cd $HOME
git clone https://github.com/absdarekar/OctoCAD.git
git clone https://github.com/absdarekar/odrive-x.git

# setup OctoCAD

echo "17 of 29"
echo "Setting up OctoCAD"
OCTOCAD_DESKTOP_LAUNCHER_PATH="$HOME/.local/share/applications"
echo "[Desktop Entry]" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Version=1.0" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Type=Application" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Terminal=false" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Name[en_IN]=OctoCAD" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Exec=python3 $HOME/OctoCAD/bin/Octocad.py" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Name=OctoCAD" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Icon=$HOME/OctoCAD/icon/logo.png" >> $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
chmod 777 $OCTOCAD_DESKTOP_LAUNCHER_PATH/OctoCAD.desktop
echo "Done"

# install MikTex

echo "18 of 29"
echo "Installing MikTex"
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys D6BC243565B2087BC3F897C9277A7293F59E4889
echo "deb http://miktex.org/download/ubuntu focal universe" | sudo tee /etc/apt/sources.list.d/miktex.list
sudo apt-get update -y
sudo apt-get install miktex -y

# install TeXstudio

echo "19 of 29"
echo "Installing TeXstudio"
sudo apt-get install texstudio -y

# install hunspell dictionary for English US, Español and हिन्दी

echo "20 of 29"
echo "Downloading dictionaries"
sudo apt install hunspell -y
sudo apt install hunspell-es -y
sudo apt install hunspell-hi -y

# install Google Chrome

echo "21 of 29"
echo "Installing Google Chrome"
wget "https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb"
sudo dpkg --install google-chrome-stable_current_amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install GNOME shell integration extension native host connector

echo "22 of 29"
echo "Installing GNOME shell integration extension native host connector"
sudo apt-get install chrome-gnome-shell -y

# installs Microsoft Teams

echo "23 of 29"
echo "Installing Microsoft Teams"
wget "https://packages.microsoft.com/repos/ms-teams/pool/main/t/teams/teams_1.3.00.16851_amd64.deb"
sudo dpkg --install teams_1.3.00.16851_amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install Discord

echo "24 of 29"
echo "Installing Discord"
wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install VLC

echo "25 of 29"
echo "Installing VLC media player"
sudo snap install vlc

# install GNU Image Manipulation Program

echo "26 of 29"
echo "Installing GNU Image Manipulation Program"
sudo apt-get install gimp -y

# install Audacity

echo "27 of 29"
echo "Installing Audacity"
sudo apt install audacity -y

# install draw.io

echo "28 of 29"
echo "Installing draw.io"
wget "https://github.com/jgraph/drawio-desktop/releases/download/v13.7.3/draw.io-amd64-13.7.3.deb"
sudo dpkg --install draw.io-amd64-13.7.3.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# remove pre installed games

echo "29 of 29"
echo "Uninstalling pre installed games"
sudo apt-get purge aisleriot gnome-sudoku gnome-mahjongg gnome-mines -y
