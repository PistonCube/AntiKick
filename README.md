# Antikick (Beta)

A plugin for Velocity that intercepts player kicks from backend servers and allows control over how they are handled.

> ⚠️ This is a **beta version** of the plugin. It may contain bugs or unexpected behavior.

## 📦 Description

**Antikick** is a plugin for Velocity that intercepts player kicks from backend servers and allows control over how they are handled. Currently, it displays the kick reason and disconnects the player with that message. Useful as a base for implementing redirection logic or protection against automatic kicks.

Made with the help of ChatGPT.

## ✨ Features

- Listens to `KickedFromServerEvent`
- Logs plugin initialization
- Compatible with Velocity Proxy
- Created by **PistonCube**

## 🚀 Installation

1. Build the plugin with Gradle/Maven or download the compiled `.jar`.
2. Place it in your Velocity proxy's `plugins/` directory.
3. Restart the proxy.
