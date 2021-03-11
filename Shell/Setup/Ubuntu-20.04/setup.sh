#!/bin/sh

# Shell script to setup Atharv Darekar's Ubuntu 20.04 LTS Environment
# author: Atharv Darekar

# Enable Universe repository, update and upgrade the system

sudo add-apt-repository universe && sudo apt-get update && sudo apt-get upgrade -y

# install curl

sudo apt install curl -y

# install Cryptomator

sudo add-apt-repository ppa:sebastian-stenzel/cryptomator -y && sudo apt-get update -y
sudo apt-get install cryptomator -y

# install odrive Sync Agent

path="$HOME/.local/bin" && curl -L "https://dl.odrive.com/odrive-py" --create-dirs -o "$path/odrive.py" && curl -L "https://dl.odrive.com/odriveagent-lnx-64" | tar -xvzf- -C "$path/" && curl -L "https://dl.odrive.com/odrivecli-lnx-64" | tar -xvzf- -C "$path/"
chmod +x $HOME/.local/bin/*

# install dconf-editor

sudo apt-get install dconf-editor -y

# install mkusb

sudo add-apt-repository ppa:mkusb/ppa -y && sudo apt-get update -y
sudo apt-get install mkusb usb-pack-efi -y

# install pip3

sudo apt install python3-pip -y

## install PyQt5, PyQtWebEngine and pyqt5-tools

pip3 install PyQt5 && pip3 install pyqt5-tools && pip3 install PyQtWebEngine

# install Qt 5 Designer

sudo apt install qtcreator -y

# install GNU Octave and octave-symbolic package

sudo apt install octave -y
sudo apt-get install octave-symbolic -y

# installs FreeCAD

sudo add-apt-repository ppa:freecad-maintainers/freecad-stable -y && sudo apt-get update
sudo apt install freecad -y

# install Java Development Kit

sudo apt install default-jdk -y

# install Atom

wget -O atom-amd64.deb "https://atom.io/download/deb"
sudo dpkg --install  atom-amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install Git

sudo apt-get install git-core git-gui git-doc -y

# setup Git

git config --global user.name "absdarekar"
git config --global user.email "absdarekar01@gmail.com"

# install MikTex

sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys D6BC243565B2087BC3F897C9277A7293F59E4889
echo "deb http://miktex.org/download/ubuntu focal universe" | sudo tee /etc/apt/sources.list.d/miktex.list
sudo apt-get update -y
sudo apt-get install miktex -y

# install TeXstudio

sudo apt-get install texstudio -y

# install hunspell dictionary for English US, Español and हिन्दी

sudo apt install hunspell -y
sudo apt install hunspell-es -y
sudo apt install hunspell-hi -y

# install Chrome

wget "https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb"
sudo dpkg --install google-chrome-stable_current_amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install GNOME Shell integration extension's native host connector

sudo apt-get install chrome-gnome-shell -y

# installs Microsoft Teams

wget "https://packages.microsoft.com/repos/ms-teams/pool/main/t/teams/teams_1.3.00.16851_amd64.deb"
sudo dpkg --install teams_1.3.00.16851_amd64.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install Discord

wget -O discord.deb "https://discordapp.com/api/download?platform=linux&format=deb"
sudo dpkg --install discord.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# install VLC

sudo snap install vlc

# install GNU Image Manipulation Program

sudo apt-get install gimp -y

# install Audacity

sudo apt install audacity -y

# install draw.io

wget "https://github.com/jgraph/drawio-desktop/releases/download/v13.7.3/draw.io-amd64-13.7.3.deb"
sudo dpkg --install draw.io-amd64-13.7.3.deb
sudo apt-get -f install -y
sudo dpkg --configure -a

# remove pre installed games

sudo apt-get purge aisleriot gnome-sudoku gnome-mahjongg gnome-mines -y
