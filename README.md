<h1 align="center">OpenCord</h1>
<p align="center">
  <a href="https://github.com/topminipie/OpenCord/stargazers">
    <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/topminipie/OpenCord?logo=github&style=for-the-badge">
  </a>
  <a href="https://github.com/topminipie/OpenCord/forks">
    <img alt="GitHub forks" src="https://img.shields.io/github/forks/topminipie/OpenCord?logo=github&style=for-the-badge">
  </a>
  <a href="https://github.com/topminipie/OpenCord/blob/main/LICENSE">
    <img alt="License" src="https://img.shields.io/github/license/topminipie/OpenCord?color=%23007ec6&style=for-the-badge">
  </a>
  <br/>
  <p align="center">
    An open-source Material You implementation of the Discord Android app.
  </p>
</p>

## Preview

|                          Chat                           |                          Drawer                           |
|:-------------------------------------------------------:|:---------------------------------------------------------:|
|    <img src=".github/assets/chat.png" width="200"/>     |    <img src=".github/assets/drawer.png" width="200"/>     |
| <img src=".github/assets/themed_chat.png" width="200"/> | <img src=".github/assets/themed_drawer.png" width="200"/> |

## FAQ

### Will this client support "plugins" or custom features/themes?

Most likely in the future, however our first priority is to implement most of the stock client's
features. To check our current progress, see [STATUS.md](/STATUS.md). You are always welcome to fork
and add features or do it just privately!

### Is this against Discord TOS?

Yes, it is. However, there has been no instances of Discord banning people for just using modified
clients. What they do automatically ban for, is API abuse or strange requests. Therefore, OpenCord
takes great caution in emulating official clients exactly, but as it is still in development, please
***use an alt account for your safety.***

## Build Debug Release

Windows:

```
.\gradlew.bat app:assembleDebug
```

Linux/macOS:

```
./gradlew app:assembleDebug
```

Built APK will be at `app/build/outputs/apk/debug/app-debug.apk`
