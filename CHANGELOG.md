# Changelog
All notable changes to this repository will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## [1.2.1] - *Sunday, October 9th 2022*

*Note: Nothing really happened.*

### Changed
- Changed [README.md](https://github.com/Googool/PaperJDA/blob/master/README.md)
- Updated [pom.xml](https://github.com/Googool/PaperJDA/blob/master/pom.xml) dependencies
  - JDA `5.0.0-alpha.19` to `5.0.0-alpha.21`

### Fixed
- Fixed imports inside [`Presence`](https://github.com/Googool/PaperJDA/blob/master/src/main/java/com/googool/github/paperjda/Events/Presence.java) and [`CommandManager`](https://github.com/Googool/PaperJDA/blob/master/src/main/java/com/googool/github/paperjda/Commands/CommandManager.java) files because of the `ReadyEvent` changes in the newest JDA [release](https://github.com/DV8FromTheWorld/JDA/releases/tag/v5.0.0-alpha.21).


## [1.2.0] - *Saturday, October 1st 2022*

*Note: Status and Presence options has been placed as comments inside the file.*

### Added
- Added an option for setting the `Presence` of the application

### Fixed
- Fixed an issue with committing to the `master` branch


## [1.1.0] - *Friday, September 30th 2022*

*Note: Creating commands is still done the same way as in the previous version. This might change in a future version.*

### Added
- Added a [`CommandManager`](https://github.com/Googool/PaperJDA/blob/master/src/main/java/com/googool/github/paperjda/Commands/CommandManager.java) to manage Discord commands
- Added [`/ping`](https://github.com/Googool/PaperJDA/blob/master/src/main/java/com/googool/github/paperjda/Commands/Discord/Ping.java) as a command
- Added Code of conduct for contributions
- Added [CHANGELOG.md](https://github.com/Googool/PaperJDA/CHANGELOG.md)

### Removed
- Removed the `DiscordListener`
- Removed `/fart` as a command

### Changed
- General file structure of the repository
- Changed to [Semantic Versioning](https://semver.org/spec/v2.0.0.html)


## [1.0.0] - *Wednesday, September 14th 2022*

*Note: First initial release of the project.*

### Added
- Everything.