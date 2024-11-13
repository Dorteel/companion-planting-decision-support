
# Companion Planting Ontology

## Introduction
This repository contains the Companion Planting Ontology, a resource developed by the [Knowledge in AI](https://kai.cs.vu.nl/) group of Vrije Universiteit Amsterdam, for the purpose of understanding and implementing companion planting strategies in agriculture. Companion planting is the practice of growing certain plants in proximity for pest control, pollination, providing habitat for beneficial creatures, maximizing use of space, and to otherwise increase crop productivity.

## Purpose of the Ontology
- **Enhancing Agricultural Knowledge**: To provide a structured and detailed knowledge base about companion planting.
- **Facilitating Decision Making**: To assist gardeners and farmers in making informed decisions about plant pairings.
- **Promoting Biodiversity**: To encourage biodiversity in gardens and farms through informed plant choices.
- **Optimizing Plant Health and Yield**: To help in selecting plant combinations that improve growth and yield.
- **Pest Management**: To offer natural alternatives for pest control through strategic plant placement.
- **Educational Tool**: To serve as an educational resource for students and enthusiasts in agriculture and gardening.

## Competency Questions
The ontology is designed to answer key questions that aid in understanding and applying companion planting principles effectively. Some of these questions include:

- What plants are beneficial to grow together for pest control?
- Which plant combinations should be avoided in a garden or farm setting?
- What are the best companion plants for a specific crop (e.g., tomatoes)?
- How can companion planting be used to combat specific pests (e.g., aphids)?

Feel free to explore the ontology and contribute to its development. Your insights and feedback are valuable in enhancing this knowledge base.

## How to run
To run the front- and back-end you simply run the docker compose in this directory. However you need to do the following things before.
- Install java and mvn for the backend
- Compile the back-end (from the Companion-Queries folder) using the command "./mvnw clean package". This produces the necessary jar file for the next command to work.
- execute "docker compose build" and then "docker compose up" from this folder.

## How to cite
This github repository is the source code for the project presented in the paper "**Supporting Companion Planting with the CoPla Ontology**" at the Knowledge Graph for Sustainability Workshop, at ESWC 2024 [[pdf](https://ceur-ws.org/Vol-3753/paper3.pdf)] . Please use the following bib information to cite the paper:

```
@inproceedings{DBLP:conf/kg4s/ZamprognoARNSKP24,
  author       = {Giacomo Zamprogno and
                  Mark Adamik and
                  Ritten Roothaert and
                  Ameneh Naghdipour and
                  Lise Stork and
                  Patrick Koopmann and
                  Romana Pernisch and
                  Benno Kruit and
                  Jieying Chen and
                  Ilaria Tiddi and
                  Stefan Schlobach},
  title        = {Supporting Companion Planting with the CoPla Ontology},
  booktitle    = {KG4S@ESWC},
  series       = {{CEUR} Workshop Proceedings},
  volume       = {3753},
  pages        = {29--41},
  publisher    = {CEUR-WS.org},
  year         = {2024}
}
```

